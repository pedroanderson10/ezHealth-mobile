package com.example.ezhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastro1 extends AppCompatActivity {


    private EditText cadastroNome, cadastroSobrenome;
    private Button buttonProximo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro1);

        //* Confirmar se todos os campos estão preenchidos //
        cadastroNome = findViewById(R.id.editTextNome);
        cadastroSobrenome = findViewById(R.id.editTextSobrenome);
        buttonProximo1 = findViewById(R.id.buttonProximo1);

        cadastroNome.addTextChangedListener(cadastro1Watcher);
        cadastroSobrenome.addTextChangedListener(cadastro1Watcher);
        // Confirmar se todos os campos estão preenchidos *//

    }

    // Confirmar se todos os campos estão preenchidos

    private TextWatcher cadastro1Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String nomeInput = cadastroNome.getText().toString().trim();
            String sobrenomeInput = cadastroSobrenome.getText().toString().trim();

            buttonProximo1.setEnabled(!nomeInput.isEmpty() && !sobrenomeInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    public void IrTela2(View v){
        Intent intent = new Intent(this, TelaCadastro2.class);
        startActivity(intent);

    }

}