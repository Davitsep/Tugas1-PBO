package com.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih;
        String kondisi;
        double Fahrenheit, Reamur, Celcius, Kelvin;
        double suhuAwal;
        boolean ulang = true;

        Scanner input = new Scanner(System.in);
        System.out.println("+-----------------------------+");
        System.out.println("|  PROGRAM KONVERSI SUHU AIR  |");
        System.out.println("+-----------------------------+");
        System.out.println("Input Data");
        System.out.println("-----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        suhuAwal = input.nextDouble();
        Konversi kalkulator = new Konversi(suhuAwal);

        while (ulang) {
            Fahrenheit = kalkulator.toFahrenheit();
            Reamur = kalkulator.toReamur();
            Kelvin = kalkulator.toKelvin();
            Celcius = kalkulator.celcius;
            kondisi = kalkulator.kondisiAir();

            System.out.println("Opsi");
            System.out.println("---");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");

            pilih = input.nextInt();
            switch (pilih) {
                case 1 :
                    System.out.println("Suhu dalam Celcius\t\t: " + Celcius + "°C");
                    System.out.println("Suhu dalam Fahrenheit\t: " + Fahrenheit + "°F");
                    System.out.println("Suhu dalam Reamur\t\t: " + Reamur + "°R");
                    System.out.println("Suhu dalam Kelvin\t\t: " + Kelvin + "K");
                    System.out.println("Kondisi Air " + kondisi);
                    break;
                case 2 :
                    System.out.print("Suhu Dalam Celcius\t: ");
                    suhuAwal = input.nextDouble();
                    kalkulator.ubahCelcius(suhuAwal);
                    break;
                case 3 :
                    ulang = false;
                    break;
            }
            if (pilih < 1 || pilih > 3){
                System.out.println("Opsi tidak ada, mohon masukkan opsi dengan benar!\n");
            }
        }

    }
}
