/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasindividu;

/**
 *
 * @author VICTUS
 */
public class class1 {
     private String productId;
    private String productName;
    private int stock;
    private double price;
    private String category;
    
    public class1(){
        stock = 0;
    }
    public class1(String productId, String productName, int stock, double price, String category){
        this.productId = productId;
        this.productName = productName;
        setStock(stock);
        setPrice(price);
        this.category = category;
    }

    public int getStock(){
        return stock;
    }

    public String getProductName(){
        return productName;
    }

    public void setStock(int stock){
        if(stock >= 0){
            this.stock = stock;
        }else{
            System.out.println("Stock tidak boleh negatif");
        }
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Harga tidak valid");
        }
    }

    public void addStock(int amount){
        if(amount > 0){
            stock += amount;
            System.out.println("Stock berhasil ditambah");
        }
    }

    public void reduceStock(int amount){
        if(amount > 0 && amount <= stock){
            stock -= amount;
            System.out.println("Stock berhasil dikurangi");
        }else{
            System.out.println("Stock tidak cukup");
        }
    }

    public void checkStock(){
        System.out.println("Produk: " + productName);
        System.out.println("Stock: " + stock);
    }
    
}
    