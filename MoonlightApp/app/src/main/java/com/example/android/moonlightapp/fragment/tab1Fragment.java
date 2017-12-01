package com.example.android.moonlightapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.android.moonlightapp.R;

import java.io.Serializable;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1Fragment extends Fragment {
    int price, totprice;
    int hargaNasgor, hargaMiegor, hargaMiereb, hargaGtea, hargaChoco, hargaMoon;
    CheckBox nasgor, miegor, miereb, gtea, choco, moon;
    Button order;

    public tab1Fragment() {
        // Required empty public constructor
    }

    public class MyClass implements Serializable{
        private int id;
        private String created;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }


    public int getTotprice() {
        return totprice;
    }

    public void setTotprice(int totprice) {
        this.totprice = totprice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHargaNasgor() {
        return hargaNasgor;
    }

    public void setHargaNasgor(int hargaNasgor) {
        this.hargaNasgor = hargaNasgor;
    }

    public int getHargaMiegor() {
        return hargaMiegor;
    }

    public void setHargaMiegor(int hargaMiegor) {
        this.hargaMiegor = hargaMiegor;
    }

    public int getHargaMiereb() {
        return hargaMiereb;
    }

    public void setHargaMiereb(int hargaMiereb) {
        this.hargaMiereb = hargaMiereb;
    }

    public int getHargaGtea() {
        return hargaGtea;
    }

    public void setHargaGtea(int hargaGtea) {
        this.hargaGtea = hargaGtea;
    }

    public int getHargaChoco() {
        return hargaChoco;
    }

    public void setHargaChoco(int hargaChoco) {
        this.hargaChoco = hargaChoco;
    }

    public int getHargaMoon() {
        return hargaMoon;
    }

    public void setHargaMoon(int hargaMoon) {
        this.hargaMoon = hargaMoon;
    }

    public CheckBox getNasgor() {
        return nasgor;
    }

    public void setNasgor(CheckBox nasgor) {
        this.nasgor = nasgor;
    }

    public CheckBox getMiegor() {
        return miegor;
    }

    public void setMiegor(CheckBox miegor) {
        this.miegor = miegor;
    }

    public CheckBox getMiereb() {
        return miereb;
    }

    public void setMiereb(CheckBox miereb) {
        this.miereb = miereb;
    }

    public CheckBox getGtea() {
        return gtea;
    }

    public void setGtea(CheckBox gtea) {
        this.gtea = gtea;
    }

    public CheckBox getChoco() {
        return choco;
    }

    public void setChoco(CheckBox choco) {
        this.choco = choco;
    }

    public CheckBox getMoon() {
        return moon;
    }

    public void setMoon(CheckBox moon) {
        this.moon = moon;
    }

    public Button getOrder() {
        return order;
    }

    public void setOrder(Button order) {
        this.order = order;
    }

    public int pesan(View view) {
        int price = 0;
        if (nasgor.isChecked())
            price += 10000 * hargaNasgor;
        if (miegor.isChecked())
            price += 9000 * hargaMiegor;
        if (miereb.isChecked())
            price += 8000 * hargaMiereb;
        if (gtea.isChecked())
            price += 5000 * hargaGtea;
        if (choco.isChecked())
            price += 15000 * hargaChoco;
        if (moon.isChecked()) ;
        price += 25000 * hargaMoon;

        return totprice = price;
    }
}
