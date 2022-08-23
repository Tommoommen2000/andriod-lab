package com.example.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next(View v){
        EditText uname = findViewById(R.id.userid);
        EditText pwd = findViewById(R.id.pwd);
//        Intent intent =new Intent(this,secondactivity.class);
//        intent.putExtra("name")
        if (uname.getText().toString().equals("tom") && pwd.getText().toString().equals("123")){
        Toast.makeText(this,String.format("user name:%s , password: %s",
                uname.getText().toString(),pwd.getText().toString()),
                Toast.LENGTH_SHORT).show();

        }
        else
        {
            uname.setError("Invalid input");
        }
    }

}