package id.io.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import id.io.app.databinding.ActivityDaftarBinding;

public class DaftarActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityDaftarBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        b = DataBindingUtil.setContentView(this, R.layout.activity_daftar);
        
        b.halamanLogin.setOnClickListener(this);
        b.btnDaftar.setOnClickListener(this);
        b.btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDaftar:
                Toast.makeText(this, "Daftar", Toast.LENGTH_SHORT).show();
            case R.id.halamanLogin:
                Intent intentLogin = new Intent(DaftarActivity.this, LoginActivity.class);
                startActivity(intentLogin);
                finish();
                break;
            case R.id.btnBack:
                finish();
                break;
        }
    }
}
