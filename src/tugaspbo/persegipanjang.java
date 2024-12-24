/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author afkar
 */
public class persegipanjang extends bangundatar {
    double panjang;
    double lebar;
    
    public persegipanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double hitungluas(){
        luas = panjang * lebar;
        return luas;
    }
    @Override
    public double hitungkeliling(){
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
    
            public String infokeliling(){
        return "" + keliling;
    }
        
    public String infoluas(){
        return "" + luas;
    }
    
        public void ingfo(){
        System.out.println("persegi panjang");
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
        System.out.println("keliling : " + keliling);
        System.out.println("luas : " + luas);
        System.out.println();
    }
}
