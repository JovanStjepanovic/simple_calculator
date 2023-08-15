package com.example.androidkalkulator_domaci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button plus, minus, puta, podeljeno, jednako, clear;

    private TextView text;
    EditText result;
   private String num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
  private   int counter = 0;
   private static  double broj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.Button0);
        button1 = findViewById(R.id.Button1);
        button2 = findViewById(R.id.Button2);
        button3 = findViewById(R.id.Button3);
        button4 = findViewById(R.id.Button4);
        button5 = findViewById(R.id.Button5);
        button6 = findViewById(R.id.Button6);
        button7 = findViewById(R.id.Button7);
        button8 = findViewById(R.id.Button8);
        button9 = findViewById(R.id.Button9);
        plus = findViewById(R.id.PlusButton);
        minus = findViewById(R.id.Minusbutton);
        puta = findViewById(R.id.Multippication);
        podeljeno = findViewById(R.id.Divisionbutton);
        jednako = findViewById(R.id.EqualsButton);
        text = findViewById(R.id.Textview1);
        result = findViewById(R.id.EditText1);
        clear = findViewById(R.id.Clearbutton);






            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num1 = "1";

                    text.setText(text.getText().toString() + num1);

                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    num2 = "2";
                    text.setText(text.getText().toString() + num2);

                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    num3 = "3";
                    text.setText(text.getText().toString() + num3);

                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    num4 = "4";
                    text.setText(text.getText().toString() + num4);

                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    num5 = "5";
                    text.setText(text.getText().toString() + num5);

                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    num6 = "6";
                    text.setText(text.getText().toString() + num6);

                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    num7 = "7";
                    text.setText(text.getText().toString() + num7);

                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    num8 = "8";
                    text.setText(text.getText().toString() + num8);

                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    num9 = "9";
                    text.setText(text.getText().toString() + num9);

                }
            });
            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    num0 = "0";

                    if (text.getText().toString().contains("1") || text.getText().toString().contains("2") || text.getText().toString().contains("3")
                            || text.getText().toString().contains("4") || text.getText().toString().contains("5") || text.getText().toString().contains("6") ||
                            text.getText().toString().contains("7") || text.getText().toString().contains("8") || text.getText().toString().contains("9")) {
                        text.setText(text.getText().toString() + num0);
                    }

                }
            });



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((text.getText().toString().contains("1") || text.getText().toString().contains("2") || text.getText().toString().contains("3")
                        || text.getText().toString().contains("4") || text.getText().toString().contains("5") || text.getText().toString().contains("6") ||
                        text.getText().toString().contains("7") || text.getText().toString().contains("8") || text.getText().toString().contains("9")) &&
                        (text.getText().toString().endsWith("1") || text.getText().toString().endsWith("2") || text.getText().toString().endsWith("3") ||
                                text.getText().toString().endsWith("4") || text.getText().toString().endsWith("5") || text.getText().toString().endsWith("6") ||
                                text.getText().toString().endsWith("7") || text.getText().toString().endsWith("8") || text.getText().toString().endsWith("9"))
                ||text.getText().toString().endsWith("0") ) {


                    text.setText(text.getText().toString() + minus.getText().toString());
                }


            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((text.getText().toString().contains("1") || text.getText().toString().contains("2") || text.getText().toString().contains("3")
                        || text.getText().toString().contains("4") || text.getText().toString().contains("5") || text.getText().toString().contains("6") ||
                        text.getText().toString().contains("7") || text.getText().toString().contains("8") || text.getText().toString().contains("9")) &&
                        (text.getText().toString().endsWith("1") || text.getText().toString().endsWith("2") || text.getText().toString().endsWith("3") ||
                                text.getText().toString().endsWith("4") || text.getText().toString().endsWith("5") || text.getText().toString().endsWith("6") ||
                                text.getText().toString().endsWith("7") || text.getText().toString().endsWith("8") || text.getText().toString().endsWith("9")) ||
                        text.getText().toString().endsWith("0") ) {


                    text.setText(text.getText().toString() + plus.getText().toString());
                }


            }
        });
        podeljeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((text.getText().toString().contains("1") || text.getText().toString().contains("2") || text.getText().toString().contains("3")
                        || text.getText().toString().contains("4") || text.getText().toString().contains("5") || text.getText().toString().contains("6") ||
                        text.getText().toString().contains("7") || text.getText().toString().contains("8") || text.getText().toString().contains("9")) &&
                        (text.getText().toString().endsWith("1") || text.getText().toString().endsWith("2") || text.getText().toString().endsWith("3") ||
                                text.getText().toString().endsWith("4") || text.getText().toString().endsWith("5") || text.getText().toString().endsWith("6") ||
                                text.getText().toString().endsWith("7") || text.getText().toString().endsWith("8") || text.getText().toString().endsWith("9")) ||
                        text.getText().toString().endsWith("0") ) {


                    text.setText(text.getText().toString() + podeljeno.getText().toString());
                }


            }
        });

        puta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((text.getText().toString().contains("1") || text.getText().toString().contains("2") || text.getText().toString().contains("3")
                        || text.getText().toString().contains("4") || text.getText().toString().contains("5") || text.getText().toString().contains("6") ||
                        text.getText().toString().contains("7") || text.getText().toString().contains("8") || text.getText().toString().contains("9")) &&
                        (text.getText().toString().endsWith("1") || text.getText().toString().endsWith("2") || text.getText().toString().endsWith("3") ||
                                text.getText().toString().endsWith("4") || text.getText().toString().endsWith("5") || text.getText().toString().endsWith("6") ||
                                text.getText().toString().endsWith("7") || text.getText().toString().endsWith("8") || text.getText().toString().endsWith("9") ||
                                text.getText().toString().endsWith("0"))) {


                    text.setText(text.getText().toString() + puta.getText().toString());
                }


            }
        });





        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text.getText().toString().contains("1") || text.getText().toString().contains("2") || text.getText().toString().contains("3")
                        || text.getText().toString().contains("4") || text.getText().toString().contains("5") || text.getText().toString().contains("6") ||
                        text.getText().toString().contains("7") || text.getText().toString().contains("8") || text.getText().toString().contains("9")) {

                    String pomocni = text.getText().toString();

                    text.setText(pomocni.substring(0, pomocni.length() - 1));


                }
                clear.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {

                        text.setText(null);
                        result.setText(null);
                        return true;
                    }
                });

            }
        });

        jednako.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pomocni2=text.getText().toString();

                eval(pomocni2);

                result.setText(""+broj);


            }
        });



    }

    public  static double eval(final String str){
     return  broj=new Object() {
         int pos = -1, ch;

         void nextChar() {
             ch = (++pos < str.length()) ? str.charAt(pos) : -1;
         }

         boolean eat(int charToEat) {
             while (ch == ' ') nextChar();
             if (ch == charToEat) {
                 nextChar();
                 return true;
             }
             return false;
         }

         double parse() {
             nextChar();
             double x = parseExpression();
             if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
             return x;
         }

         double parseExpression() {
             double x = parseTerm();
             for (;;) {
                 if      (eat('+')) x += parseTerm(); // addition
                 else if (eat('-')) x -= parseTerm(); // subtraction
                 else return x;
             }
         }

         double parseTerm() {
             double x = parseFactor();
             for (;;) {
                 if      (eat('X')) x *= parseFactor(); // multiplication
                 else if (eat('÷')) x /= parseFactor(); // division
                 else return x;
             }
         }

         double parseFactor() {
             if (eat('+')) return parseFactor(); // unary plus
             if (eat('-')) return -parseFactor(); // unary minus

             double x;
             int startPos = this.pos;
             if (eat('(')) { // parentheses
                 x = parseExpression();
                 eat(')');
             } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                 while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                 x = Double.parseDouble(str.substring(startPos, this.pos));
             } else if (ch >= 'a' && ch <= 'z') { // functions
                 while (ch >= 'a' && ch <= 'z') nextChar();
                 String func = str.substring(startPos, this.pos);
                 x = parseFactor();
                 if (func.equals("sqrt")) x = Math.sqrt(x);
                 else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                 else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                 else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                 else throw new RuntimeException("Unknown function: " + func);
             } else {
                 throw new RuntimeException("Unexpected: " + (char)ch);
             }

             if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation


             return x;

         }
     }.parse();

    }

}