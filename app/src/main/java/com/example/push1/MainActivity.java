package com.example.push1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast("Hello hao");
    }
    public void test1(){
        int i = 1+ 1;
    }
    public void Toast(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
