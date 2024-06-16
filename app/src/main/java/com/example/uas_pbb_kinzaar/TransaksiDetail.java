package com.example.uas_pbb_kinzaar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TransaksiDetail extends AppCompatActivity {

    private Spinner spinnerPesawat;
    private EditText jumlahPenumpang;
    private TextView totalBayar;
    private Button buttonBayar;

    private int hargaPerOrang = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi_detail);

        spinnerPesawat = findViewById(R.id.spinnerpesawat);
        jumlahPenumpang = findViewById(R.id.jumlahpenumpang);
        totalBayar = findViewById(R.id.total);
        buttonBayar = findViewById(R.id.buttonBayar);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.daftar_pesawat,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPesawat.setAdapter(adapter);

        spinnerPesawat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                switch (position) {
                    case 0:
                        hargaPerOrang = 400000; // B50
                        break;
                    case 1:
                        hargaPerOrang = 450000; // A789
                        break;
                    case 2:
                        hargaPerOrang = 500000; // DC345
                        break;
                    case 3:
                        hargaPerOrang = 530000; // JL147
                        break;
                }
                updateTotalBayar();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }
        });


        jumlahPenumpang.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Do nothing here
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                updateTotalBayar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });


        buttonBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void updateTotalBayar() {

        try {
            int jumlah = Integer.parseInt(jumlahPenumpang.getText().toString());
            int total = jumlah * hargaPerOrang;
            totalBayar.setText("TOTAL BAYAR: Rp " + total);
        } catch (NumberFormatException e) {
            totalBayar.setText("TOTAL BAYAR: Rp 0");
        }
    }
}
