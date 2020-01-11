package com.suryadv.kalkulatorpintar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText bi11, bi12,hasil;
    Button faktorial , fpb , permutasi ,  kombinasi ;

    int n , r , m , permu;
    int fakl , fak2 , fak3;

    int besar , kecil;
    int jawabfpb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bi11 = (EditText) findViewById(R.id.bil1);
        bi12 = (EditText) findViewById(R.id.bil2);
        hasil = (EditText) findViewById(R.id.hasil);
        faktorial = (Button) findViewById(R.id.faktorial);
        fpb = (Button) findViewById(R.id.fpb);
        permutasi = (Button) findViewById(R.id.permutasi);
        kombinasi = (Button) findViewById(R.id.kombinasi);
        //faktorial
        faktorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fakl=1;
                n=Integer.parseInt(bi11.getText().toString());

                while (n>0){
                    fakl=fakl*n;
                    n=n-1;
                }
                hasil.setText(""+fakl);
            }
        });
        //faktor persekutuan tersebar
        fpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                besar = Integer.parseInt(bi12.getText().toString());
                kecil = Integer.parseInt(bi11.getText().toString());

                for (int i = kecil; i > 0; i--) {
                    if (kecil % i == 0 && besar % i == 0) {
                        jawabfpb = i;
                        hasil.setText(""+jawabfpb);
                        break;
                    }
                }
            }
        });

        //permutasi
        permutasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fakl=fak2=fak3=1;

                n=Integer.parseInt(bi11.getText().toString());
                r=Integer.parseInt(bi12.getText().toString());

                m=n-r;
                if (n<0){
                    hasil.setText("Angka yang ada masukan salah");
                }else {
                    while (n>0){
                        fakl=fakl*n;
                        n=n-1;
                    }
                    while (m>0){
                        fak2=fak2*m;
                        m=m-1;
                    }
                }
                permu=fakl/fak2;
                hasil.setText(""+permu);
            }
        });

        //kombinasi
        kombinasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fakl=fak2=fak3=1;

                n=Integer.parseInt(bi11.getText().toString());
                r=Integer.parseInt(bi12.getText().toString());

                m=n-r;
                if (n<0){
                    hasil.setText("Angka yang ada masukan salah");
                }else {
                    while (n>0){
                        fakl=fakl*n;
                        n=n-1;
                    }
                    while (m>0){
                        fak2=fak2*m;
                        m=m-1;
                    }
                    while (r>0){
                        fak3=fak3*r;
                        r=r-1;
                    }
                }
                permu=(fakl/fak2)/fak3;
                hasil.setText(""+permu);
            }
        });


    }

}
