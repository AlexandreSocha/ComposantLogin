package com.nouveaupackage.composantlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button LoginBtn, CancelBtn;
    String Pseudo, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginBtn = findViewById(R.id.btnLogin);
        CancelBtn = findViewById(R.id.btnCancel);
    }

    public void onClickLogin(View view){

        Intent intent = new Intent();

        Pseudo = ((EditText) findViewById(R.id.txtUname)).getText().toString();
        Password = ((EditText) findViewById(R.id.txtPwd)).getText().toString();

        intent.putExtra("Pseudo", Pseudo);
        intent.putExtra("Password", Password);

        setResult(1, intent);
        finish();
    }

    public void onClickCancel(View view){
        Intent intent = new Intent();

        String message = "Annulation";
        intent.putExtra("MessageAnnulation", message);

        setResult(-1, intent);
        finish();
    }

}