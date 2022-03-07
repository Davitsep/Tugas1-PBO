package com.tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ulang;
        do {
            Scanner input = new Scanner(System.in);
            String pilih;
            System.out.println("=====================");
            System.out.println("Menu Utama");
            System.out.println("=====================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextLine();

            if(pilih.equalsIgnoreCase("1")){

                double panjang, lebar, tinggi;
                System.out.print("Input Panjang: ");
                panjang = input.nextInt();
                System.out.print("Input Lebar: ");
                lebar = input.nextInt();
                System.out.print("Input Tinggi: ");
                tinggi = input.nextInt();
                Balok balok = new Balok(panjang, lebar, tinggi);

                System.out.println("Luas Persegi Panjang= " + balok.hitungLuas());
                System.out.println("Keliling Persegi Panjang= " + balok.hitungKeliling());
                System.out.println("Volume Balok= " + balok.hitungVolume());
                System.out.println("Luas Permukaan Balok= " + balok.hitungLuasPermukaan());

            } else if (pilih.equalsIgnoreCase("2")){
                double tinggi, jari;
                System.out.print("Input Tinggi: ");
                tinggi = input.nextInt();
                System.out.print("Input Jari - jari: ");
                jari = input.nextInt();
                Tabung tabung = new Tabung(jari, tinggi);

                System.out.println("Luas Lingkaran= " + tabung.hitungLuas());
                System.out.println("Keliling Lingkaran= " + tabung.hitungKeliling());
                System.out.println("Volume Tabung= " + tabung.hitungVolume());
                System.out.println("Luas Permukaan Tabung= " + tabung.hitungLuasPermukaan());

            } else if (pilih.equalsIgnoreCase("3")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulang = input.nextInt();
        } while (ulang == 1);

    }
}
