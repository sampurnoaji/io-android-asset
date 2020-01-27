package id.io.app.ui.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import id.io.app.R;
import id.io.app.databinding.ActivityDaftarBinding;

public class DaftarActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityDaftarBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        b = DataBindingUtil.setContentView(this, R.layout.activity_daftar);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

    }}
}
