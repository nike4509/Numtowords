package com.example.numtowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtnumber;
    private TextView txtresult;
    private Button btnNumtoword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnumber=findViewById(R.id.enternumber);
        txtresult=findViewById(R.id.dispoutput);
        btnNumtoword =findViewById(R.id.btnnumtoword);

        btnNumtoword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input = Integer.parseInt(txtnumber.getText().toString());
                NumModel model = new NumModel();
                if (input < 20) {

                    txtresult.setText(model.getFirstdigit()[input]);
                } else if (input < 100) {
                    int tensIndex = input / 10;
                    int onesIndex = input % 10;

                    if (onesIndex != 0) {
                        txtresult.setText(model.getSeconddigit()[tensIndex] + " " + model.getFirstdigit()[onesIndex]);
                    } else {
                        txtresult.setText(model.getSeconddigit()[tensIndex]);
                    }
                } else {
                    int hundredsIndex = input / 100;
                    int remainder = input % 100;
                    int tensIndex = remainder / 10;
                    int onesIndex = remainder % 10;

                    if (onesIndex != 0) {
                        txtresult.setText(model.getFirstdigit()[hundredsIndex] + " Hundred " + model.getSeconddigit()[tensIndex] +
                                " " + model.getFirstdigit()[onesIndex]);
                    } else {
                        txtresult.setText(model.getFirstdigit()[hundredsIndex] + " Hundred " + model.getSeconddigit()[tensIndex]);
                    }
                }
            }});
        }
    }
