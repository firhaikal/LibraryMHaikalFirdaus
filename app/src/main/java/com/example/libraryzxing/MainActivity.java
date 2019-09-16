package com.example.libraryzxing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class MainActivity extends AppCompatActivity {

    Button btnQR, btnPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQR = (Button)findViewById(R.id.btnQr);
        btnPdf = (Button)findViewById(R.id.btntxtPDF);

        onClickIntent(btnQR, QRActivity.class);
        onClickIntent(btnPdf,PdfActivity.class);

    }

    public void onClickIntent(Button btn, final Class dest){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,dest);
                startActivity(pindah);
            }
        });
    }
}