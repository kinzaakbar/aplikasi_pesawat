package com.example.uas_pbb_kinzaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void PesawatClick(View view) {

        Intent intent = new Intent(this, Pesawat.class);
        startActivity(intent);
    }
    public void Pesawat2Click(View view) {
        Intent intent = new Intent(this, Pesawat2.class);
        startActivity(intent);
    }
    public void Pesawat3Click(View view) {
        Intent intent = new Intent(this, Pesawat3.class);
        startActivity(intent);
    }
    public void Pesawat4Click(View view) {
        Intent intent = new Intent(this, Pesawat4.class);
        startActivity(intent);
    }
}

