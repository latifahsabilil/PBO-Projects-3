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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang pp = new PersegiPanjang();
        
        pp.luasPPanjang(10, 5);
        pp.luasPPanjang(3.6, 8);
        pp.luasPPanjang(6, 8.3);
        pp.luasPPanjang(5.6, 8.8);
        
        pp.kelilingPPanjang(10, 5);
        pp.kelilingPPanjang(3.6, 8);
        pp.kelilingPPanjang(6, 8.3);
        pp.kelilingPPanjang(5.6, 8.8);
        
        Persegi p = new Persegi();
        
        p.luasPersegi(4.5);
        p.luasPersegi(7);
        
        p.kelilingPersegi(4.5);
        p.kelilingPersegi(7);
        
        Lingkaran l = new Lingkaran();
        
        l.luasLingkaran(5);
        l.luasLingkaran(7.4);
        
        l.kelilingLingkaran(5);
        l.kelilingLingkaran(7.4);
        
        Segitiga s = new Segitiga();
        
        s.luasSegitiga(8, 10);
        s.luasSegitiga(8, 11.5);
        s.luasSegitiga(12.2, 9);
        s.luasSegitiga(13.9, 20.7);
        
        s.kelilingSegitiga(8, 10);
        s.kelilingSegitiga(8, 11.5);
        s.kelilingSegitiga(12.2, 9);
        s.kelilingSegitiga(13.9, 20.7);
    }
    
}
