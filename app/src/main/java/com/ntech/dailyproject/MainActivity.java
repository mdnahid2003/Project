package com.ntech.dailyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.tvdisplay);
        button = findViewById(R.id.btn);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");


                if (editText.length()>0){
                    String snumber = editText.getText().toString();
                    int number = Integer.parseInt(snumber);

                        //PROCESSING
                        if (number%2 ==0 ){
                             textView.setText("jor");
                         }
                         else {
                             textView.setText("bijor");
                         }




                }else{
                    editText.setError("no number");
                }





            }
        });




    }
}