package com.example.irhari.irhamfakhri_1202150070_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String Makanan = intent.getStringExtra("Makanan");
        String jlmporsi = intent.getStringExtra("jlmporsi");
        String Rm = intent.getStringExtra("RM");
        TextView textmakanan = findViewById(R.id.NamaMakanan);
        TextView Porsi = findViewById(R.id.Jumlah);
        TextView Reatbos = findViewById(R.id.RumahMakan2);
        TextView Hitung = findViewById(R.id.Jumlah2);
        int A = Integer.parseInt(jlmporsi);

        int HargaEatbus = 50000 * A;
        String B = String.valueOf(HargaEatbus);

        int C = Integer.parseInt(jlmporsi);
        int HargaAbnormal = 30000 * C;
        String D = String.valueOf(HargaAbnormal);


        if (Rm.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                textmakanan.setText(Makanan);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(B);
                Toast.makeText(this, "Jangan disini makannya,berat,dompet kamu gak akan sanggup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(B);
                Toast.makeText(this, "Udah ah disini aja", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                textmakanan.setText(Makanan);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(D);
                Toast.makeText(this, "Jangan disini makannya,berat,dompet kamu gak akan sanggup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(D);
                Toast.makeText(this, "Udah ah disini aja", Toast.LENGTH_LONG).show();
            }
        }

    }

}