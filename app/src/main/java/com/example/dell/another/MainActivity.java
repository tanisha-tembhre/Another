package com.example.dell.another;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addbtn = (Button)findViewById(R.id.addbtn);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1editText = findViewById(R.id.num1editText);
                EditText num2editText = findViewById(R.id.num2editText);
                TextView result = findViewById(R.id.result);

                int num1=Integer.parseInt(num1editText.getText().toString());
                int num2=Integer.parseInt(num2editText.getText().toString());
                int res= num1+num2;

                result.setText(res+"");
            }
        });
    }
}
