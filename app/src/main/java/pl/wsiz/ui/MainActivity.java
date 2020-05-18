package pl.wsiz.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {




    private int changedSound;
    private Button switchButton;

    private MediaPlayer mPlayer;

    private View whiteKey_1, whiteKey_2, whiteKey_3, whiteKey_4, whiteKey_5, whiteKey_6, whiteKey_7,whiteKey_8,whiteKey_9,whiteKey_10,whiteKey_11,whiteKey_12,whiteKey_13,whiteKey_14;
    private View blackKey_1, blackKey_2,blackKey_3,blackKey_4,blackKey_5,blackKey_6,blackKey_7,blackKey_8,blackKey_9,blackKey_10;


    //dla bialych klawiszy
    private boolean whiteKey_1_Playing;
    private boolean whiteKey_2_Playing;
    private boolean whiteKey_3_Playing;
    private boolean whiteKey_4_Playing;
    private boolean whiteKey_5_Playing;
    private boolean whiteKey_6_Playing;
    private boolean whiteKey_7_Playing;
    private boolean whiteKey_8_Playing;
    private boolean whiteKey_9_Playing;
    private boolean whiteKey_10_Playing;
    private boolean whiteKey_11_Playing;
    private boolean whiteKey_12_Playing;
    private boolean whiteKey_13_Playing;
    private boolean whiteKey_14_Playing;


    //dla czarnych klawiszy
    private boolean blackKey_1_Playing;
    private boolean blackKey_2_Playing;
    private boolean blackKey_3_Playing;
    private boolean blackKey_4_Playing;
    private boolean blackKey_5_Playing;
    private boolean blackKey_6_Playing;
    private boolean blackKey_7_Playing;
    private boolean blackKey_8_Playing;
    private boolean blackKey_9_Playing;
    private boolean blackKey_10_Playing;



    private boolean piano_Playing;
    //-----------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        whiteKey_1 = findViewById(R.id.whiteKey_1);
        whiteKey_2 = findViewById(R.id.whiteKey_2);
        whiteKey_3 = findViewById(R.id.whiteKey_3);
        whiteKey_4 = findViewById(R.id.whiteKey_4);
        whiteKey_5 = findViewById(R.id.whiteKey_5);
        whiteKey_6 = findViewById(R.id.whiteKey_6);
        whiteKey_7 = findViewById(R.id.whiteKey_7);
        whiteKey_8 = findViewById(R.id.whiteKey_8);
        whiteKey_9 = findViewById(R.id.whiteKey_9);
        whiteKey_10 = findViewById(R.id.whiteKey_10);
        whiteKey_11 = findViewById(R.id.whiteKey_11);
        whiteKey_12 = findViewById(R.id.whiteKey_12);
        whiteKey_13 = findViewById(R.id.whiteKey_13);
        whiteKey_14 = findViewById(R.id.whiteKey_14);


        blackKey_1 = findViewById(R.id.blackKey_1);
        blackKey_2 = findViewById(R.id.blackKey_2);
        blackKey_3 = findViewById(R.id.blackKey_3);
        blackKey_4 = findViewById(R.id.blackKey_4);
        blackKey_5 = findViewById(R.id.blackKey_5);
        blackKey_6 = findViewById(R.id.blackKey_6);
        blackKey_7 = findViewById(R.id.blackKey_7);
        blackKey_8 = findViewById(R.id.blackKey_8);
        blackKey_9 = findViewById(R.id.blackKey_9);
        blackKey_10 = findViewById(R.id.blackKey_10);



        whiteKey_1.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_2.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_3.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_4.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_5.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_6.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_7.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_8.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_9.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_10.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_11.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_12.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_13.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
        whiteKey_14.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));

        blackKey_1.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_2.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_3.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_4.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_5.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_6.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_7.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_8.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_9.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
        blackKey_10.setBackgroundColor(getResources().getColor(R.color.blackKey_up));


        piano_Playing = false;

        // dla bialych klawiszy
        whiteKey_1_Playing=false;
        whiteKey_2_Playing=false;
        whiteKey_3_Playing=false;
        whiteKey_4_Playing=false;
        whiteKey_5_Playing=false;
        whiteKey_6_Playing=false;
        whiteKey_7_Playing=false;
        whiteKey_8_Playing=false;
        whiteKey_9_Playing=false;
        whiteKey_10_Playing=false;
        whiteKey_11_Playing=false;
        whiteKey_12_Playing=false;
        whiteKey_13_Playing=false;
        whiteKey_14_Playing=false;


        // dla czarnych klawiszy
        blackKey_1_Playing=false;
        blackKey_2_Playing=false;
        blackKey_3_Playing=false;
        blackKey_4_Playing=false;
        blackKey_5_Playing=false;
        blackKey_6_Playing=false;
        blackKey_7_Playing=false;
        blackKey_8_Playing=false;
        blackKey_9_Playing=false;
        blackKey_10_Playing=false;

        switchButton=findViewById(R.id.switchXML);

        changedSound=1;


        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changedSound++;
                if(changedSound>3){
                    changedSound=1;
                }

                Toast.makeText(MainActivity.this, changedSound==1?"Changed to piano":changedSound==2?"Changed to keyboard":"Changed to synth",Toast.LENGTH_SHORT).show();
            }
        });



        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


        whiteKey_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_1.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_1.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        whiteKey_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_2.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_2.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });

        whiteKey_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_3.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_3.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        whiteKey_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_4.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_4.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });

        whiteKey_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_5.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_5.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });

        whiteKey_6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_6.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_6.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        whiteKey_7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_7.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_7.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });

        whiteKey_8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_8.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_8.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        whiteKey_9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_9.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_9.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        whiteKey_10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_10.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_10.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });



        whiteKey_11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_11.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_11.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });

        whiteKey_12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_12.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_12.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        whiteKey_13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_13.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_13.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        whiteKey_14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    whiteKey_14.setBackgroundColor(getResources().getColor(R.color.whiteKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    whiteKey_14.setBackgroundColor(getResources().getColor(R.color.whiteKey_up));
                }

                return false;
            }
        });


        // ---------------- CZARNE KLAWISZE ------------------------
        blackKey_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_1.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_1.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        blackKey_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_2.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_2.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        blackKey_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_3.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_3.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        blackKey_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_4.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_4.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        blackKey_5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_5.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_5.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        blackKey_6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_6.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_6.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        blackKey_7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_7.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_7.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        blackKey_8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_8.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_8.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });


        blackKey_9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_9.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_9.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });


        blackKey_10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    blackKey_10.setBackgroundColor(getResources().getColor(R.color.blackKey_down));
                }

                if(event.getAction()==MotionEvent.ACTION_UP){
                    blackKey_10.setBackgroundColor(getResources().getColor(R.color.blackKey_up));
                }

                return false;
            }
        });

        // PONIŻEJ JEST TAK ZAMYKAJĄCY onCreate
    }


// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

        public void play_whiteKey_1(View view){

        if(!whiteKey_1_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(1);

            piano_Playing=true;
            whiteKey_1_Playing=true;

        } else if(!whiteKey_1_Playing&&piano_Playing){
    //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(1);
            whiteKey_1_Playing=true;

        } else {
                // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(1);
            whiteKey_1_Playing=false;
            piano_Playing=false;
        }

    }



    public void play_whiteKey_2(View view){

        if(!whiteKey_2_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(2);

            piano_Playing=true;
            whiteKey_2_Playing=true;

        } else if(!whiteKey_2_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(2);
            whiteKey_2_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(2);
            whiteKey_2_Playing=false;
            piano_Playing=false;
        }

    }

    public void play_whiteKey_3(View view){

        if(!whiteKey_3_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(3);

            piano_Playing=true;
            whiteKey_3_Playing=true;

        } else if(!whiteKey_3_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();


            setPlayingAttr();

            startplaying(3);
            whiteKey_3_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(3);
            whiteKey_3_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_whiteKey_4(View view){

        if(!whiteKey_4_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(4);

            piano_Playing=true;
            whiteKey_4_Playing=true;

        } else if(!whiteKey_4_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(4);
            whiteKey_4_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(4);
            whiteKey_4_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_whiteKey_5(View view){

        if(!whiteKey_5_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(5);

            piano_Playing=true;
            whiteKey_5_Playing=true;

        } else if(!whiteKey_5_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(5);
            whiteKey_5_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(5);
            whiteKey_5_Playing=false;
            piano_Playing=false;
        }

    }

    public void play_whiteKey_6(View view){

        if(!whiteKey_6_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(6);

            piano_Playing=true;
            whiteKey_6_Playing=true;

        } else if(!whiteKey_6_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(6);
            whiteKey_6_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(6);
            whiteKey_6_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_whiteKey_7(View view){

        if(!whiteKey_7_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(7);

            piano_Playing=true;
            whiteKey_7_Playing=true;

        } else if(!whiteKey_7_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(7);
            whiteKey_7_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(7);
            whiteKey_7_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_whiteKey_8(View view){

        if(!whiteKey_8_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(8);

            piano_Playing=true;
            whiteKey_8_Playing=true;

        } else if(!whiteKey_8_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(8);
            whiteKey_8_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(8);
            whiteKey_8_Playing=false;
            piano_Playing=false;
        }

    }

    public void play_whiteKey_9(View view){

        if(!whiteKey_9_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(9);

            piano_Playing=true;
            whiteKey_9_Playing=true;

        } else if(!whiteKey_9_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(9);
            whiteKey_9_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(9);
            whiteKey_9_Playing=false;
            piano_Playing=false;
        }

    }



    public void play_whiteKey_10(View view){

        if(!whiteKey_10_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(10);

            piano_Playing=true;
            whiteKey_10_Playing=true;

        } else if(!whiteKey_10_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(10);
            whiteKey_10_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(10);
            whiteKey_10_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_whiteKey_11(View view){

        if(!whiteKey_11_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(11);

            piano_Playing=true;
            whiteKey_11_Playing=true;

        } else if(!whiteKey_11_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(11);
            whiteKey_11_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(11);
            whiteKey_11_Playing=false;
            piano_Playing=false;
        }

    }




    public void play_whiteKey_12(View view){

        if(!whiteKey_12_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(12);

            piano_Playing=true;
            whiteKey_12_Playing=true;

        } else if(!whiteKey_12_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(12);
            whiteKey_12_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(12);
            whiteKey_12_Playing=false;
            piano_Playing=false;
        }

    }



    public void play_whiteKey_13(View view){

        if(!whiteKey_13_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(13);

            piano_Playing=true;
            whiteKey_13_Playing=true;

        } else if(!whiteKey_13_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(13);
            whiteKey_13_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(13);
            whiteKey_13_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_whiteKey_14(View view){

        if(!whiteKey_14_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(14);

            piano_Playing=true;
            whiteKey_14_Playing=true;

        } else if(!whiteKey_14_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(14);
            whiteKey_14_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(14);
            whiteKey_14_Playing=false;
            piano_Playing=false;
        }

    }









    // ------------------ CZARNE KLAWISZE PONIZEJ -----------------------
    //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''


    public void play_blackKey_1(View view){

        if(!blackKey_1_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(15);

            piano_Playing=true;
            blackKey_1_Playing=true;

        } else if(!blackKey_1_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(15);
            blackKey_1_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(15);
            blackKey_1_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_blackKey_2(View view){

        if(!blackKey_2_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(16);

            piano_Playing=true;
            blackKey_2_Playing=true;

        } else if(!blackKey_2_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(16);
            blackKey_2_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(16);
            blackKey_2_Playing=false;
            piano_Playing=false;
        }

    }



    public void play_blackKey_3(View view){

        if(!blackKey_3_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(17);

            piano_Playing=true;
            blackKey_1_Playing=true;

        } else if(!blackKey_3_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(17);
            blackKey_3_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(17);
            blackKey_3_Playing=false;
            piano_Playing=false;
        }

    }



    public void play_blackKey_4(View view){

        if(!blackKey_4_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(18);

            piano_Playing=true;
            blackKey_4_Playing=true;

        } else if(!blackKey_4_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(18);
            blackKey_4_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(18);
            blackKey_4_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_blackKey_5(View view){

        if(!blackKey_5_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(19);

            piano_Playing=true;
            blackKey_5_Playing=true;

        } else if(!blackKey_5_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(19);
            blackKey_5_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(19);
            blackKey_5_Playing=false;
            piano_Playing=false;
        }

    }



    public void play_blackKey_6(View view){

        if(!blackKey_6_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(20);

            piano_Playing=true;
            blackKey_6_Playing=true;

        } else if(!blackKey_6_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(20);
            blackKey_6_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(20);
            blackKey_6_Playing=false;
            piano_Playing=false;
        }

    }

    public void play_blackKey_7(View view){

        if(!blackKey_7_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(21);

            piano_Playing=true;
            blackKey_7_Playing=true;

        } else if(!blackKey_7_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(21);
            blackKey_7_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(21);
            blackKey_7_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_blackKey_8(View view){

        if(!blackKey_8_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(22);

            piano_Playing=true;
            blackKey_8_Playing=true;

        } else if(!blackKey_8_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(22);
            blackKey_8_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(22);
            blackKey_8_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_blackKey_9(View view){

        if(!blackKey_9_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(23);

            piano_Playing=true;
            blackKey_9_Playing=true;

        } else if(!blackKey_9_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(23);
            blackKey_9_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(23);
            blackKey_9_Playing=false;
            piano_Playing=false;
        }

    }


    public void play_blackKey_10(View view){

        if(!blackKey_10_Playing&&!piano_Playing){
            //kiedy pierwszy raz nacisniesz jakikolwiek klawisz

            startplaying(24);

            piano_Playing=true;
            blackKey_10_Playing=true;

        } else if(!blackKey_10_Playing&&piano_Playing){
            //kiedy nacisniesz jakis klawisz w momencie w ktorym gra jeszcze inny
            stopPlaying();

            setPlayingAttr();

            startplaying(24);
            blackKey_10_Playing=true;

        } else {
            // KIEDY PRZYCISKASZ 2 I KOLEJNY RAZ TEN SAM KLAWISZ
            stopPlaying();
            startplaying(24);
            blackKey_10_Playing=false;
            piano_Playing=false;
        }

    }





    private void startplaying(int startPlayingRecordNR) {


            switch (startPlayingRecordNR) {

                //dla bialych kalwiszy
                case 1:
                    if(changedSound==1){
                        mPlayer=MediaPlayer.create(this,R.raw.sound_1_1);
                     } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_1_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_1_3);
                    }


                    break;


                case 2:

                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_3_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_3_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_3_3);
                    }


                    break;

                case 3:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_5_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_5_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_5_3);
                    }

                    break;

                case 4:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_6_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_6_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_6_3);
                    }


                    break;

                case 5:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_8_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_8_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_8_3);
                    }


                    break;

                case 6:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_10_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_10_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_10_3);
                    }


                    break;
                case 7:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_12_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_12_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_12_3);
                    }

                    break;



                case 8:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_13_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_13_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_13_3);
                    }


                    break;

                case 9:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_15_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_15_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_15_3);
                    }


                    break;

                case 10:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_17_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_17_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_17_3);
                    }

                    break;

                case 11:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_18_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_18_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_18_3);
                    }

                    break;

                case 12:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_20_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_20_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_20_3);
                    }

                    break;

                case 13:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_22_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_22_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_22_3);
                    }

                    break;

                case 14:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_24_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_24_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_24_3);
                    }

                    break;


                // - - - DLA CZARNYCH KLAWISZY - - - - - - - - - - - - - - - - - - - -
                case 15:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_2_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_2_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_2_3);
                    }
                    break;

                case 16:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_4_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_4_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_4_3);
                    }

                    break;

                case 17:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_7_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_7_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_7_3);
                    }

                    break;

                case 18:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_9_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_9_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_9_3);
                    }

                    break;

                case 19:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_11_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_11_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_11_3);
                    }

                    break;

                case 20:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_14_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_14_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_14_3);
                    }

                    break;

                case 21:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_16_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_16_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_16_3);
                    }

                    break;

                case 22:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_19_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_19_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_19_3);
                    }
                    break;

                case 23:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_21_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_21_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_21_3);
                    }

                    break;

                case 24:
                    if(changedSound==1){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_23_1);
                    } else if(changedSound==2){
                        mPlayer = MediaPlayer.create(this, R.raw.sound_23_2);
                    } else {
                        mPlayer = MediaPlayer.create(this, R.raw.sound_23_3);
                    }

                    break;

            }

            mPlayer.start();

    }


    private void setPlayingAttr(){
        whiteKey_1_Playing=false;
        whiteKey_2_Playing=false;
        whiteKey_3_Playing=false;
        whiteKey_4_Playing=false;
        whiteKey_5_Playing=false;
        whiteKey_6_Playing=false;
        whiteKey_7_Playing=false;
        whiteKey_8_Playing=false;
        whiteKey_9_Playing=false;
        whiteKey_10_Playing=false;
        whiteKey_11_Playing=false;
        whiteKey_12_Playing=false;
        whiteKey_13_Playing=false;
        whiteKey_14_Playing=false;

        blackKey_1_Playing=false;
        blackKey_2_Playing=false;
        blackKey_3_Playing=false;
        blackKey_4_Playing=false;
        blackKey_5_Playing=false;
        blackKey_6_Playing=false;
        blackKey_7_Playing=false;
        blackKey_8_Playing=false;
        blackKey_9_Playing=false;
        blackKey_10_Playing=false;
    }



    private void stopPlaying(){

        mPlayer.release();
        mPlayer=null;

    }



}
