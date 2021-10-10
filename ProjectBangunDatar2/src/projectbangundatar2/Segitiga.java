/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Lenovo
 */
public class Segitiga {
    void luasSegitiga(int alas, int tinggi){
        int luas = alas * tinggi / 2;
        System.out.println("Luas persegi tersebut adalah " + luas + " satuan luas");
    }
    
    void luasSegitiga(int alas, double tinggi){
        double luas = alas * tinggi / 2;
        System.out.println("Luas persegi tersebut adalah " + luas + " satuan luas");
    }
    
    void luasSegitiga(double alas, int tinggi){
        double luas = alas * tinggi / 2;
        System.out.println("Luas persegi tersebut adalah " + luas + " satuan luas");
    }
    
    void luasSegitiga(double alas, double tinggi){
        double luas = alas * tinggi / 2;
        System.out.println("Luas persegi tersebut adalah " + luas + " satuan luas");
    }
    
    void kelilingSegitiga(int alas, int tinggi){
        double miring = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2));
        double keliling = alas + tinggi + miring;
        System.out.println("Keliling persegi tersebut adalah " + keliling + " satuan luas");
    }
    
    void kelilingSegitiga(double alas, int tinggi){
        double miring = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2));
        double keliling = alas + tinggi + miring;
        System.out.println("Keliling persegi tersebut adalah " + keliling + " satuan luas");
    }
    
    void kelilingSegitiga(int alas, double tinggi){
        double miring = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2));
        double keliling = alas + tinggi + miring;
        System.out.println("Keliling persegi tersebut adalah " + keliling + " satuan luas");
    }
    
    void kelilingSegitiga(double alas, double tinggi){
        double miring = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2));
        double keliling = alas + tinggi + miring;
        System.out.println("Keliling persegi tersebut adalah " + keliling + " satuan luas");
    }
}
