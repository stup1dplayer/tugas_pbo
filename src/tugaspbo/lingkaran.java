/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author afkar
 */
public class lingkaran extends bangundatar {
    double jejari;
    
    public lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    @Override
    public double hitungluas(){
        luas = 3.14 * jejari * jejari;
        return luas;
    }
    @Override
    public double hitungkeliling(){
        keliling = 2 * 3.14 * jejari;
        return keliling;
    }
    
    public String infoluas(){
        return "" + luas;
    }
    
        public String infokeliling(){
        return "" + keliling;
    }
    
    public void ingfo(){
        System.out.println("lingkaran");
        System.out.println("jejari : " + jejari);
        System.out.println("keliling : " + keliling);
        System.out.println("luas : " + luas);
        System.out.println();
        }
}
