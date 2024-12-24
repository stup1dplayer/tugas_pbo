/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author M S I
 */
public class aksesBelanja extends PembayaranBelanja {
    public static void main(String[] args) {
        PembayaranBelanja pb = new PembayaranBelanja();
        
        System.out.println("Silahkan pilih metode pembayaran anda: ");
        System.out.println("1.Cash");
        System.out.println("2.Qris");
        System.out.println("3.Ewallet");
        System.out.println("4.Credit Card");
        System.out.println("5.Debit Card");
        System.out.println("6.Gopay");
        System.out.println("7.Shopeepay");
        
        
    }
}
