package com.example.geek_sharbel.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnsBoard[][];
    LinearLayout linearLayout;
    int plValue = 0;
    int plMove = 0;
    int plWin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsBoard = new Button[3][3];
        btnsBoard[0][0]  = findViewById(R.id.btn_b00);
        btnsBoard[0][1]  = findViewById(R.id.btn_b01);
        btnsBoard[0][2]  = findViewById(R.id.btn_b02);
        btnsBoard[1][0] = findViewById(R.id.btn_b10);
        btnsBoard[1][1]  = findViewById(R.id.btn_b11);
        btnsBoard[1][2]  = findViewById(R.id.btn_b12);
        btnsBoard[2][0]  = findViewById(R.id.btn_b20);
        btnsBoard[2][1]  = findViewById(R.id.btn_b21);
        btnsBoard[2][2]  = findViewById(R.id.btn_b22);
        Button reset_btn = findViewById(R.id.btn_reset);
        TextView TvscoreInfo = findViewById(R.id.tv_scoreInfo);
        linearLayout = findViewById(R.id.boardLayout);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btnsBoard[i][j] = (Button) linearLayout.getChildAt(3 * i + j);
            }
        }
    }

    public void checkWin() {
          /**
          * Horizontal (Rows)
          * */
        for (int i = 0; i< 3; i++) {
            if (btnsBoard[i][0].getText().toString().equals(btnsBoard[i][1].getText().toString())
                    && btnsBoard[i][0].getText().toString().equals(btnsBoard[i][2].getText().toString())) {
                /* Player X*/
                if (btnsBoard[i][0].getText().toString().equals("X")) {
                    plMove = 1;
                    if(plValue == 0) {
                        plWin = 1;
                    }else if (plValue == 1) {
                        plWin = 2;
                    }
                }
                /* Player O  */
                else if (btnsBoard[i][0].getText().toString().equals("O")) {
                    plMove = 1;
                    if (plValue == 0) {
                        plWin = 2;
                    } else if (plValue == 1) {
                        plWin = 1;
                    }
                }

                if (!btnsBoard[i][0].getText()
                        .toString().equals(" ")) {
                    btnsBoard[i][0].setTextColor(Color.BLUE);
                    btnsBoard[i][1].setTextColor(Color.BLUE);
                    btnsBoard[i][2].setTextColor(Color.BLUE);
                }
            }

            /**
             *  Vertical (Columns)
             * */

            if(btnsBoard[0][i].getText().toString().equals(btnsBoard[1][i].getText().toString())
                    && btnsBoard[0][i].getText().toString().equals(btnsBoard[2][i].getText().toString())) {
                /* player X*/
                if (btnsBoard[0][i].getText().toString().equals("X")) {
                    plMove = 1;
                    if (plValue == 0) {
                        plWin = 1;
                    } else if (plValue == 1) {
                        plWin = 2;
                    }
                }
                /* player O */
                else if (btnsBoard[0][i].getText().toString().equals("O")) {
                    plMove = 1;
                    if (plValue == 0){
                        plWin = 2;
                    } else if( plValue == 1) {
                        plWin = 1;
                    }
                }

                if (!btnsBoard[0][i].getText().toString().equals(" ")) {
                    btnsBoard[0][i].setTextColor(Color.BLUE);
                    btnsBoard[1][i].setTextColor(Color.BLUE);
                    btnsBoard[2][i].setTextColor(Color.BLUE);
                }
            }

            /**
             *  Diagonal (1st)
             * */
            if(btnsBoard[0][0].getText().toString().equals(btnsBoard[1][1].getText().toString())
                    && btnsBoard[0][0].getText().toString().equals(btnsBoard[2][2].getText().toString())) {
                /* player X*/
                if(btnsBoard[0][0].getText().toString().equals("X")) {
                    plMove = 1;
                    if(plValue == 0) {
                        plWin = 1;
                    } else if (plValue == 1) {
                        plWin = 2;
                    }
                }
                /* player O*/
                else if (btnsBoard[0][0].getText().toString().equals("O")) {
                    plMove = 1;
                    if(plValue == 0) {
                        plWin = 2;
                    } else if (plValue == 1) {
                        plWin = 1;
                    }
                }
                if(!btnsBoard[0][0].getText().toString().equals("")) {
                    btnsBoard[0][0].setTextColor(Color.BLUE);
                    btnsBoard[1][1].setTextColor(Color.BLUE);
                    btnsBoard[2][2].setTextColor(Color.BLUE);
                }

            }

            /**
             *  Diagonal (2nd)
             * */
            if(btnsBoard[0][2].getText().toString().equals(btnsBoard[1][1].getText().toString())
                    && btnsBoard[0][2].getText().toString().equals(btnsBoard[2][0].getText().toString())) {
                /* player X*/
                if(btnsBoard[0][2].getText().toString().equals("X")) {
                    plMove = 1;
                    if(plValue == 0) {
                        plWin = 1;
                    } else if (plValue == 1) {
                        plWin = 2;
                    }
                }
                /* player O*/
                else if (btnsBoard[0][2].getText().toString().equals("O")) {
                    plMove = 1;
                    if(plValue == 0) {
                        plWin = 2;
                    } else if (plValue == 1) {
                        plWin = 1;
                    }
                }
                if(!btnsBoard[2][0].getText().toString().equals("")) {
                    btnsBoard[2][0].setTextColor(Color.BLUE);
                    btnsBoard[1][1].setTextColor(Color.BLUE);
                    btnsBoard[0][2].setTextColor(Color.BLUE);
                }

            }

        }
    }

    public void gamePlay() {
        
    }
}
