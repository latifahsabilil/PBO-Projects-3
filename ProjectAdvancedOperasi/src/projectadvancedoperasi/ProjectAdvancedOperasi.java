/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Lenovo
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi op = new Operasi();
        
        System.out.println("Hasil dari penjumlahan tersebut adalah " + op.jumlahkan(3, 4));
        System.out.println("Hasil dari penjumlahan tersebut adalah " + op.jumlahkan(4, 7, -9));
        System.out.println("Hasil dari penjumlahan tersebut adalah " + op.jumlahkan(3.4, -0.002, 0.12313));
        
        System.out.println("Hasil dari perkalian tersebut adalah " + op.kalikan(3, 4));
        System.out.println("Hasil dari perkalian tersebut adalah " + op.kalikan(4, 7, -9));
        System.out.println("Hasil dari perkalian tersebut adalah " + op.kalikan(3.4, -0.002, 0.12313));
    }
    
}
