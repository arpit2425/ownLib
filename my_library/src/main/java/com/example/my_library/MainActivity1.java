package com.example.my_library;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity1 extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.email);
        t2=findViewById(R.id.phone);
        t3=findViewById(R.id.pass);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),thanks.class));
            }
        });
    }
    public static void run()
    {
      MainActivity1 b=new MainActivity1();
      Bundle b1=new Bundle();
      b.onCreate(b1);
    }
}
