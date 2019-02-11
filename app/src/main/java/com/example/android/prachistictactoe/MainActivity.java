package com.example.android.prachistictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Player player1 = new Player(1);
    Player player2 = new Player(2);


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main_layout);



        final Button button00 = (Button) findViewById(R.id.button00);
        final Button button01 = (Button) findViewById(R.id.button01);
        final Button button02 = (Button) findViewById(R.id.button02);

    final Button button10 = (Button) findViewById(R.id.button10);
    final Button button11 = (Button) findViewById(R.id.button11);
    final Button button12 = (Button) findViewById(R.id.button12);
    final Button button20 = (Button) findViewById(R.id.button20);
    final Button button21 = (Button) findViewById(R.id.button21);
    final Button button22 = (Button) findViewById(R.id.button22);

        final TextView Winner=(TextView)findViewById(R.id.Winner);

        player1.playerName="Player1";
        player2.playerName="Player2";


            button00.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Player player;
                    String text;
                    if (Player.count % 2 == 0) {
                        player = player1;
                        text = "X";
                    } else {
                        player = player2;
                        text = "O";
                    }
                    player.touched(0, 0);
                    button00.setText(text);
                    Player.countIncrease();

                    if (player.hasWon()) {
                        Winner.setText(player.playerName+" Won !!");
                    }
                }
            });

            button01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Player player;
                    String text;
                    if (Player.count % 2 == 0) {
                        player = player1;
                        text = "X";
                    } else {
                        player = player2;
                        text = "O";
                    }
                    player.touched(0, 1);
                    button01.setText(text);
                    Player.countIncrease();

                    if (player.hasWon()) {
                        Winner.setText(player.playerName+" Won !!");

                    }
                }
            });

            button02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Player player;
                    String text;
                    if (Player.count % 2 == 0) {
                        player = player1;
                        text = "X";
                    } else {
                        player = player2;
                        text = "O";

                    }
                    player.touched(0, 2);
                    button02.setText(text);
                    Player.countIncrease();



                    if (player.hasWon()) {
                        Winner.setText(player.playerName+" Won !!");

                    }
                }
            });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Player player;
                String text;
                if (Player.count % 2 == 0) {
                    player = player1;
                    text = "X";
                } else {
                    player = player2;
                    text = "O";
                }
                player.touched(1, 0);
                button10.setText(text);
                Player.countIncrease();


                if (player.hasWon()) {
                    Winner.setText(player.playerName+" Won !!");

                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player player;
                String text;
                if (Player.count % 2 == 0) {
                    player = player1;
                    text = "X";
                } else {
                    player = player2;
                    text = "O";
                }
                player.touched(1, 1);
                button11.setText(text);
                Player.countIncrease();



                if (player.hasWon()) {
                    Winner.setText(player.playerName+" Won !!");

                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player player;
                String text;
                if (Player.count % 2 == 0) {
                    player = player1;
                    text = "X";
                } else {
                    player = player2;
                    text = "O";
                }
                player.touched(1, 2);
                button12.setText(text);
                Player.countIncrease();



                if (player.hasWon()) {
                    Winner.setText(player.playerName+" Won !!");

                }
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Player player;
                String text;
                if (Player.count % 2 == 0) {
                    player = player1;
                    text = "X";
                } else {
                    player = player2;
                    text = "O";
                }
                player.touched(2, 0);
                button20.setText(text);
                Player.countIncrease();


                if (player.hasWon()) {
                    Winner.setText(player.playerName+" Won !!");

                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player player;
                String text;
                if (Player.count % 2 == 0) {
                    player = player1;
                    text = "X";
                } else {
                    player = player2;
                    text = "O";
                }
                player.touched(2, 1);
                button21.setText(text);
                Player.countIncrease();


                if (player.hasWon()) {
                    Winner.setText(player.playerName+" Won !!");

                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player player;
                String text;
                if (Player.count % 2 == 0) {
                    player = player1;
                    text = "X";
                } else {
                    player = player2;
                    text = "O";
                }
                player.touched(2, 2);
                button22.setText(text);
                Player.countIncrease();



                if (player.hasWon()) {
                    Winner.setText(player.playerName+" Won !!");

                }
            }
        });

        Button resetButton=(Button)findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                for (int k=0;k<=2;k++) {
                    for (int j = 0; j <= 2; j++) {
                        player1.array[k][j]=0;
                        player2.array[k][j]=0;
                    }
                }
                button00.setText("");
                button01.setText("");
                button02.setText("");
                button10.setText("");
                button11.setText("");
                button12.setText("");
                button20.setText("");
                button21.setText("");
                button22.setText("");
                Winner.setText("");
                player1.win=false;
                player2.win=false;


            }
        });



    }
}




