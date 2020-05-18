# PianoApp

ogólna zasada działania jest taka, że tworzona jest jedna zmienna mPlayer (którą jest de faco Media Player), do której w chwili naciśnięcia klawisza przypisywany jest konkretny dźwięk w zależności od tego jaki klawisz został naciśnięty.
- cały kod dzieje się w MainActiviy
- funkcje obsługujące apkę są przypisywane do konkretnego kalwisza w pliku activity_main.xml, np:  android:onClick="play_whiteKey_3"

---

- linia 26 - tworzona jes zmienna mPlayer którą jest Media Player
- linia 28 i 29 - tworzone są View'sy, np: whiteKey_1 lub blackKey_1 do których w metodzie onCreate przypisuję View'y z pliku activity_main.xml o odpowiednim id nadanym w tym pliku xml
- linie 33-63 - tworzone są booleany okreslające czy dany klawisz aktualnie wydaje dźwięk (na tych booleanach oparte jest działanie grania dźwięków)

---

zmiana koloru klawisza po nacsiśnięciu/przytrzymaniu klawisza jest technicznie niezależna od grania dźwięku (są w osobnych setOnTouchListener'ach podczas gdy granie jest oparte na boolean'ach w osobnych funkcjach):
- linie 184-578 zawierają setOnTouchListener'y do zmiany koloru kalwisza (TYLKO ZMIANA KOLORU, obsługa dźwięków jest poniżej)

---

- linie 587-1320 zawierają funkcje obsługujące ustawienie booleanów i granie dźwięku (kazdy klawisz ma osobną funkcję)
- funkcje z linii 587-1320 jedynie ustawiają booleany i wywołują inne funkcje:
  1 - startplaying(numer_kalwisza);   <--- to ta funkcja przypisuje dany dźwięk i zaczyna go grać
  2 - stopPlaying();                  <--- ta funkcja zatrzymuje granie dźwięku
 
---
 
 linie 1326-1610 - funkcja startplaying(numer_kalwisza) :
 wewnątrz niej znajduje się switch który do mPlayer przypisuje konkretny dźwięk i uruchamia jego odtwrzanie.
są 3 brzmienia. w kodize xml jest dodany button z napisem "CHANGE SOUND". naciśnięcie go zmieni wartość zmiennej changedSound od której zależy to jakie brzmienie zostanie przypisane w switchu (obsługa naciśnięcia tego buttona to linie 159-176)

---

Jest 24 klawisze czyli 24 dźwięki. Im wyższy pierwszy numer tym wyższy dźwięk.
Każdy z 24 dźwięków jest w 3 wersjach brzmieniowych co daje razem 24*3=72 dźwięki ogólnie (zmieniane buttonem), to do którego brzmienia należy dany dźwięk określa cyfra po podłodze _    czyli:
sound_5_1    <--- 1 rodzaj brzmienia
sound_5_2    <--- 2 rodzaj brzmienia
sound_5_3    <--- 3 rodzaj brzmienia
