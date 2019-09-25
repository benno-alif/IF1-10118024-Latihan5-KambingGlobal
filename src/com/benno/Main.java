package com.benno;

    /*
    NAMA        : BENNO ALIF ANGGARA
    KELAS       : IF1
    NIM         : 10118024
    Deskripsi   : Deklarasi variabel global
     */

public class Main {

    int jumlahKambing = 88;

    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        Main kambingSusu = new Main();

        kambingSusu.getJumlahKambing();

        kambingSusu.tambahKambing();

        kambingSusu.getJumlahKambing();
    }
}
