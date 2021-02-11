package com.example.ezhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaCadastro6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro6);
    }

    public void IrTela7(View v){
        Intent intent = new Intent(this, TelaCadastro7.class);
        startActivity(intent);
    }

}