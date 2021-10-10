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
public class Lingkaran {
    void luasLingkaran(int jejari){
        double luas = jejari * jejari * 22 / 7;
        System.out.println("Luas Lingkaran tersebut adalah " + luas + " satuan luas");
    }
    
    void luasLingkaran(double jejari){
        double luas = jejari * jejari * 22 / 7;
        System.out.println("Luas Lingkaran tersebut adalah " + luas + " satuan luas");
    }
    
    void kelilingLingkaran(int jejari){
        double keliling = 2 * jejari * 22 / 7;
        System.out.println("keliling Lingkaran tersebut adalah " + keliling + " satuan luas");
    }
    
    void kelilingLingkaran(double jejari){
        double keliling = 2 * jejari * 22 / 7;
        System.out.println("keliling Lingkaran tersebut adalah " + keliling + " satuan luas");
    }
}
