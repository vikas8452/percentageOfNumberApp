package com.example.hp.percentage;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textView;
    EditText textView2;
    TextView textView3;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void buttonOnClick(View v)
    {
      //  CharSequence a= textView.getText();
        textView=(EditText)findViewById(R.id.editText);
        textView2=(EditText)findViewById(R.id.editText2);
       // textView3=(TextView)findViewById(R.id.textView2);
        textView4=(TextView)findViewById(R.id.textView3);
       // charSequence
                float a=Integer.parseInt(textView.getText().toString());
                float b=Integer.parseInt(textView2.getText().toString());
        double c=(a*b)/100;
        Button s=(Button)findViewById(R.id.button);
        textView4.setText(Double.toString(c));
        //s.setText(Float.toString(c)) ;
    }
}










