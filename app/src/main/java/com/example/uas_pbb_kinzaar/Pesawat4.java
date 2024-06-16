package com.example.uas_pbb_kinzaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pesawat4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesawat4);
    }
    public void pesanButton3OnClick(View view) {
        Intent intent = new Intent(this, TransaksiDetail.class);
        startActivity(intent);
    }
}