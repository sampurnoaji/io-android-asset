package id.io.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import id.io.app.databinding.ActivityLupaPinBinding;

public class LupaPinActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityLupaPinBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_pin);
        b = DataBindingUtil.setContentView(this, R.layout.activity_lupa_pin);

        b.btnResetPin.setOnClickListener(this);
        b.halamanLogin.setOnClickListener(this);
        b.btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnResetPin:
                Toast.makeText(this, "Reset Pin", Toast.LENGTH_SHORT).show();
                break;
            case R.id.halamanLogin:
                Intent intentLogin = new Intent(LupaPinActivity.this, LoginActivity.class);
                startActivity(intentLogin);
                finish();
                break;
            case R.id.btnBack:
                finish();
                break;
        }
    }
}
