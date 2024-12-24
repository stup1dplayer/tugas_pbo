/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author afkar
 */
public class persegi extends bangundatar {
    double sisi;
    
    public persegi(double sisi){
        this.sisi = sisi;
    }
    @Override
    public double hitungluas(){
        luas = sisi * sisi;
        return luas;
    }
    @Override
    public double hitungkeliling(){
        keliling = 4 * sisi;
        return keliling;
    }
    
        public String infokeliling(){
        return "" + keliling;
    }
        
    public String infoluas(){
        return "" + luas;
    }
        public void ingfo(){
        System.out.println("persegi");
        System.out.println("sisi : " + sisi);
        System.out.println("keliling : " + keliling);
        System.out.println("luas : " + luas);
        System.out.println();
        }
}
