package com.example.loginexamjoyson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usd,psd;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usd=(EditText) findViewById(R.id.us);
        psd= findViewById(R.id.ps);
        btn= findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fg=usd.getText().toString();
                String hi=psd.getText().toString();
                if(fg.equals("sam") && hi.equals("raw123@B"))
                {
                    Toast.makeText(MainActivity.this, "Login success for "+fg, Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Login failure", Toast.LENGTH_LONG).show();
            }}
        });
    }
}
