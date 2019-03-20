package com.example.fathinzuliantsany.itungduit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView txtHasil;
    EditText txtNominal;
    Button btnCek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        txtHasil = (TextView)findViewById(R.id.txtHasil);
        txtNominal = (EditText)findViewById(R.id.txtNominal);
        btnCek = (Button)findViewById(R.id.btnCek);

        //listener button
        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n,h;
                n = Integer.parseInt(txtNominal.getText().toString());
                h = (n/14190);
                txtHasil.setText("IDR to USD: "+h);
            }
        });
    }
}
