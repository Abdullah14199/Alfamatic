package com.example.alfamatic.Machines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.alfamatic.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Machine_one extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_one);
        pdfView =findViewById(R.id.pdfView1);
        pdfView.fromAsset("Machine One").load();
    }
}