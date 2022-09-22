package com.example.week_2_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        t1 = findViewById(R.id.editText);
        t2 = findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = t1.getText().toString();

                if (value.contains("@")){
                    t2.setText("VALID");
                }else{
                    t2.setText("INVALID");
                }
            }
        });
    }
}