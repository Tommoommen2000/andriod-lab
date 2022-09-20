package com.example.gridapp;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistrypackage com.example.gridapp;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView display_1;
    TextView display_2;

    Double leftValue;
    Double rightValue;
    Double resultValue;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display_1 = findViewById(R.id.text_dis1);
        display_2 = findViewById(R.id.text_dis2);
        leftValue=0.0;
        rightValue=0.0;
        resultValue=0.0;
    }
    public void getNumber(View view){
        Button btn = (Button) view;
        String get_content = display_2.getText().toString();
        String content = get_content + btn.getText().toString();
        display_2.setText(content);
    }
    public void getSymbol(View view){
        Button btn = (Button) view;
        operator = btn.getText().toString();
        leftValue = Double.parseDouble(display_2.getText().toString());
        display_2.setText("");
        display_1.setText(leftValue+operator);
    }
    public void doCalculation(View view){
        rightValue = Double.parseDouble(display_2.getText().toString());
        switch(operator){
            case  "+":
                resultValue = leftValue + rightValue;
                break;
            case  "-":
                resultValue = leftValue - rightValue;
                break;
            case  "x":
                resultValue = leftValue * rightValue;
                break;
            case  "/":;
                resultValue = leftValue / rightValue;
                break;
            default:
                Toast.makeText(this, "Invalid option",Toast.LENGTH_SHORT).show();
        }
        display_2.setText(resultValue.toString());
        display_1.setText(display_1.getText().toString()+rightValue+" =");
    }

    public void clearAll(View view){
        display_2.setText("");
        display_1.setText("");
        leftValue=0.0;
        rightValue=0.0;
        resultValue=0.0;
        operator="+";
    }
}
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.gridapp", appContext.getPackageName());
    }
}
