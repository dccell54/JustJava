package com.mahesaiqbal.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mahesaiqbal on 8/6/2017.
 */

public class TanpaXml extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView halo = new TextView(TanpaXml.this);
        halo.setText("Selamat datang");
        halo.setTextSize(14);
        setContentView(halo);
    }
}
