/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author afkar
 */
public class segitiga extends bangundatar {
    double alas;
    double tinggi;
    
    public segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    public double hitungluas(){
        luas = alas * tinggi * 0.5;
        return luas;
    }
    @Override
    public double hitungkeliling(){
        keliling = alas + alas + alas;
        return keliling;
    }
    
    public String infokeliling(){
        return "" + keliling;
    }
        
    public String infoluas(){
        return "" + luas;
    }
    
        public void ingfo(){
        System.out.println("segitiga");
        System.out.println("alas : " + alas);
        System.out.println("tinggi : " + tinggi);
        System.out.println("keliling : " + keliling);
        System.out.println("luas : " + luas);
        System.out.println();
        }
}
