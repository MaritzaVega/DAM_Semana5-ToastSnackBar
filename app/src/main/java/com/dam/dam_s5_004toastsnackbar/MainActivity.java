package com.dam.dam_s5_004toastsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast, btnSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast = findViewById(R.id.buttonToast);
        btnSnackBar =findViewById(R.id.buttonSnackBar);
        btnSnackBar.setOnClickListener(this);
        btnToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonToast){
            Toast.makeText(this,"Mostrando Toast",Toast.LENGTH_SHORT).show();
        }else{
            Snackbar.make(v,"Mostrando SnackBar", Snackbar.LENGTH_LONG).show();

        }
    }
}