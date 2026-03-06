/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasindividu;

/**
 *
 * @author VICTUS
 */
import java.util.Scanner;

public class TUGASINDIVIDU {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== INVENTORY SYSTEM ===");

        System.out.print("Masukkan ID Produk: ");
        String id = input.nextLine();

        System.out.print("Masukkan Nama Produk: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Stock Awal: ");
        int stock = input.nextInt();

        System.out.print("Masukkan Harga Produk: ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Kategori Produk: ");
        String kategori = input.nextLine();

        class1 produk1 = new class1(id, nama, stock, harga, kategori);

        int pilihan;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Cek Stock");
            System.out.println("2. Tambah Stock");
            System.out.println("3. Kurangi Stock");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            if(pilihan == 1){

                produk1.checkStock();

            }else if(pilihan == 2){

                System.out.print("Jumlah stock yang ditambah: ");
                int tambah = input.nextInt();
                produk1.addStock(tambah);

            }else if(pilihan == 3){

                System.out.print("Jumlah stock yang dikurangi: ");
                int kurang = input.nextInt();
                produk1.reduceStock(kurang);

            }

        }while(pilihan != 4);

        System.out.println("Program selesai");

    }

}
