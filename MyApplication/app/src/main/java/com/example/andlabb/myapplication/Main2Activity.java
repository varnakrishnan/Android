package com.example.andlabb.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;

public class Main2Activity extends AppCompatActivity {
Button b;
EditText tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b=(Button) findViewById(R.id.btn);
        tt=(EditText) findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Main3Activity.class);
                i.putExtra("user",tt.getText().toString());
                startActivity(i);
            }
        });
    }
}
