package com.example.android.moonlightapp.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.example.android.moonlightapp.R;

import static java.lang.String.valueOf;

public class OrderActivity extends AppCompatActivity {
    int total;
    int jmlqty1,jmlqty2, jmlqty3, jmlqty4, jmlqty5, jmlqty6;
    CheckBox nasgor, miegor, miereb, gtea, choco, moon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        nasgor = findViewById(R.id.nasgor);
        miegor = findViewById(R.id.miegor);
        miereb = findViewById(R.id.miereb);
        gtea = findViewById(R.id.gtea);
        choco = findViewById(R.id.choco);
        moon = findViewById(R.id.moon);
        final EditText nama = findViewById(R.id.nama);
        final EditText meja = findViewById(R.id.meja);
        final TextView bayar = findViewById(R.id.bayar);

        final TextView qty1 = findViewById(R.id.qty1);
        Button btnmin1 = findViewById(R.id.minus1);
        Button btnplus1 = findViewById(R.id.plus1);

        final TextView qty2 = findViewById(R.id.qty2);
        Button btnmin2 = findViewById(R.id.minus2);
        Button btnplus2 = findViewById(R.id.plus2);

        final TextView qty3 = findViewById(R.id.qty3);
        Button btnmin3 = findViewById(R.id.minus3);
        Button btnplus3 = findViewById(R.id.plus3);

        final TextView qty4 = findViewById(R.id.qty4);
        Button btnmin4 = findViewById(R.id.minus4);
        Button btnplus4 = findViewById(R.id.plus4);

        final TextView qty5 = findViewById(R.id.qty5);
        Button btnmin5 = findViewById(R.id.minus5);
        Button btnplus5 = findViewById(R.id.plus5);

        final TextView qty6 = findViewById(R.id.qty6);
        Button btnmin6 = findViewById(R.id.minus6);
        Button btnplus6 = findViewById(R.id.plus6);

        btnmin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqty1 > 0)
                    jmlqty1--;
                qty1.setText(valueOf(jmlqty1));
            }
        });
        btnplus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmlqty1++;
                qty1.setText(valueOf(jmlqty1));
            }
        });

        btnmin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqty2 > 0)
                    jmlqty2--;
                qty2.setText(valueOf(jmlqty2));
            }
        });
        btnplus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmlqty2++;
                qty2.setText(valueOf(jmlqty2));
            }
        });

        btnmin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqty3 > 0)
                    jmlqty3--;
                qty3.setText(valueOf(jmlqty3));
            }
        });
        btnplus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmlqty3++;
                qty3.setText(valueOf(jmlqty3));
            }
        });

        btnmin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqty4 > 0)
                    jmlqty4--;
                qty4.setText(valueOf(jmlqty4));
            }
        });
        btnplus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmlqty4++;
                qty4.setText(valueOf(jmlqty4));
            }
        });

        btnmin5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqty5 > 0)
                    jmlqty5--;
                qty5.setText(valueOf(jmlqty5));
            }
        });
        btnplus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmlqty5++;
                qty5.setText(valueOf(jmlqty5));
            }
        });

        btnmin6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqty6 > 0)
                    jmlqty6--;
                qty6.setText(valueOf(jmlqty6));
            }
        });
        btnplus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmlqty6++;
                qty6.setText(valueOf(jmlqty6));
            }
        });

        Button proses = findViewById(R.id.btnOrder);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totprice = totalharga(total);
                String name = nama.getText().toString();
                String chair = meja.getText().toString();
                bayar.setText("Meja nomor "+chair+" atas nama Bapak/Ibu "+name.toUpperCase()+
                        " total yang harus dibayar adalah\n Rp. "+totprice);
            }
        });
    }
    private int totalharga(int pesan) {
        int tambahan = 0;
        if (nasgor.isChecked())
            tambahan+= 10000*jmlqty1;

        if (miegor.isChecked())
            tambahan+= 9000*jmlqty2;

        if (miereb.isChecked())
            tambahan+= 8000*jmlqty3;

        if (gtea.isChecked())
            tambahan+= 5000*jmlqty4;

        if (choco.isChecked())
            tambahan+= 15000*jmlqty5;

        if (moon.isChecked())
            tambahan+= 25000*jmlqty6;
        return (total*pesan)+tambahan;
    }


    @Override
    public boolean onOptionsItemSelected (MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            Log.e("Home pressed", "home pressed");
            Toast.makeText(OrderActivity.this, "kembali ke menu utama", Toast.LENGTH_SHORT).show();
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
