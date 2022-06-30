package com.example.mscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import  android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static  final  String MSG="com.Register.college.msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void REGISTER(View view)
    {
      Intent intent =new Intent(this, OrderActivity.class);
        EditText editText1=findViewById(R.id.editTextTextPersonName);
        EditText editText2=findViewById(R.id.editTextTextPersonName2);
        EditText editText3=findViewById(R.id.editTextTextPersonName3);
        String message=editText1.getText().toString()+"    Roll_no-"
                +editText2.getText().toString()+"   Class-"
                +editText3.getText().toString();
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}