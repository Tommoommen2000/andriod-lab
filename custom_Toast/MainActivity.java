package com.example.customtoast;



import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.shoe_btn).setOnClickListener(view -> {
            Toast toast = new Toast(this);
            toast.setView(LayoutInflater.from(this).inflate(R.layout.toast,null));
            toast.show();
        });
    }
}