package com.dicoding.javafundamental.accessmodifier.package4;

public class Lingkaran {
    static final double PI = 3.14;

    int jari = 7;

    final double getLuas() {
        return PI * (jari * jari);
    }

    // Kelas yang dideklarasikan sebagai final maka tidak bisa dijadikan sebagai induk kelas.

//    final class Lingkaran{
//
//    }
}
