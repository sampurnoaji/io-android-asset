package id.io.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.io.app.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityLoginBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b = DataBindingUtil.setContentView(this, R.layout.activity_login);

        b.btnLogin.setOnClickListener(this);
        b.btnDaftar.setOnClickListener(this);
        b.lupaPin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                Intent intentLogin = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intentLogin);
                break;
            case R.id.btnDaftar:
                Intent intentDaftar = new Intent(LoginActivity.this, DaftarActivity.class);
                startActivity(intentDaftar);
                break;
            case R.id.lupaPin:
                Intent intentLupaPin = new Intent(LoginActivity.this, LupaPinActivity.class);
                startActivity(intentLupaPin);
        }
    }
}
