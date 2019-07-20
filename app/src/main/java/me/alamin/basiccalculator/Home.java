package me.alamin.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnClear, btnEqual, btnSum, btnSub, btnMul, btnDiv;
    private TextView input, calculateText;

    private  double number1 = Double.NaN, number2= Double.NaN, result= Double.NaN;
    private String ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupUI();

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '0');
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '1');
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '2');
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '3');
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '4');
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '5');
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '6');
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '7');
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '8');
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + '9');
            }
        });


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "ADD";
                compute();
                calculateText.setText(input.getText().toString() + " + ");
                input.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "SUB";
                compute();
                calculateText.setText(input.getText().toString() + " - ");
                input.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "MUL";
                compute();
                calculateText.setText(input.getText().toString() + " x ");
                input.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "DIV";
                compute();
                calculateText.setText(input.getText().toString() + " ÷ ");
                input.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "EQU";
                compute();
                calculateText.setText(calculateText.getText().toString() + input.getText().toString() + " = " + String.valueOf(result));
                input.setText(String.valueOf(result));
            }
        });
    }

    private void setupUI() {
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnSum = (Button) findViewById(R.id.btnSum);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);


        calculateText = (TextView) findViewById(R.id.calculateText);
        input = (TextView) findViewById(R.id.input);

    }

    private void compute() {
        if (!Double.isNaN(number1)) {
            number2 = Double.parseDouble(input.getText().toString());
            switch (ACTION) {
                case "ADD":
                    result = number1 + number2;
                    break;
                case "SUB":
                    result = number1 - number2;
                    break;
                case "MUL":
                    result = number1 * number2;
                    break;
                case "DIV":
                    result = number1 / number2;
                    break;
                case "EQU":
                    break;
            }
        } else {
            number1 = Double.parseDouble(input.getText().toString());
        }
    }

    private void setNull() {
//        input.setText(null);
//        number1 = Double.NaN;
//        number2 = Double.NaN;
//        result = Double.NaN;
    }
}
