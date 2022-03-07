package com.tugas2;

public class Tabung extends Lingkaran implements MenghitungRuang {

    private double tinggi, hasilVolume, hasilLuasPermukaan;

    public Tabung(double jariJari, double tinggiTabung) {
        super(jariJari);
        tinggi = tinggiTabung;
    }

    public double getTinggi() {

        return tinggi;
    }

    public void setTinggi(double tinggi) {

        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {

        return PHI * (super.getJari() * super.getJari()) * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {

        return 2 * (PHI * super.getJari()) * (super.getJari() + tinggi);
    }

}

