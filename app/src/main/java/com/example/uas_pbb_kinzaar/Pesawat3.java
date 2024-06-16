package com.example.uas_pbb_kinzaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pesawat3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesawat3);
    }
    public void pesanButton2OnClick(View view) {

        Intent intent = new Intent(this, TransaksiDetail.class);
        startActivity(intent);
    }
}

