package com.example.ezhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaCadastro3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro3);
    }

    public void IrTela4(View v){
        Intent intent = new Intent(this, TelaCadastro4.class);
        startActivity(intent);
    }

}