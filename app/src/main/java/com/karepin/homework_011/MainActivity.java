package com.karepin.homework_011;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = findViewById(R.id.screenTextView);
        showZero();
        showOne();
        showTwo();
        showThree();
        showFour();
        showFive();
        showSix();
        showSeven();
        showEight();
        showNine();
        showDot();
    }

    private void showZero () {
        button = findViewById(R.id.but0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
//                switch (v.getId()) {
//                    case R.id.but0:
//                        screen.setText("0");
//                        break;
//                    case R.id.but1:
//                        screen.setText("1");
//                        break;
//                    case R.id.but2:
//                        screen.setText("2");
//                        break;
//                    case R.id.but3:
//                        screen.setText("3");
//                        break;
//                    case R.id.but4:
//                        screen.setText("4");
//                        break;
//                    case R.id.but5:
//                        screen.setText("5");
//                        break;
//                    case R.id.but6:
//                        screen.setText("6");
//                        break;
//                    case R.id.but7:
//                        screen.setText("7");
//                        break;
//                    case R.id.but8:
//                        screen.setText("8");
//                        break;
//                    case R.id.but9:
//                        screen.setText("9");
//                        break;
//                }
            }
        });
    }

    private void showOne() {
        button = findViewById(R.id.but1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("1");
            }
        });
    }

    private void showTwo() {
        button = findViewById(R.id.but2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("2");
            }
        });
    }

    private void showThree() {
        button = findViewById(R.id.but3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("3");
            }
        });
    }

    private void showFour() {
        button = findViewById(R.id.but4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("4");
            }
        });
    }

    private void showFive() {
        button = findViewById(R.id.but5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("5");
            }
        });
    }

    private void showSix() {
        button = findViewById(R.id.but6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("6");
            }
        });
    }

    private void showSeven() {
        button = findViewById(R.id.but7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("7");
            }
        });
    }

    private void showEight() {
        button = findViewById(R.id.but8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("8");
            }
        });
    }

    private void showNine() {
        button = findViewById(R.id.but9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("9");
            }
        });
    }
    private void showDot() {
        button = findViewById(R.id.butDot);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
            }
        });
    }
}
