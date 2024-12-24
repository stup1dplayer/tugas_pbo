/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author M S I
 */
public class PembayaranBelanja implements MetodeBayarPakeAplikasi{
	
    double cash;
    double totalBelanja;
    double kembalian;
	
    @Override
    public double BayarCash(double cash, double belanja) {
        kembalian = cash-belanja;
        return kembalian;
    }
    
    public String cash(){
        return "Berhasil membayar "+"\n"+"kembalian anda : " + kembalian;
    }

    
    @Override
    public double BayarQRIS(int idNabasah, double saldo, double totalBelanja) {
        kembalian = saldo-totalBelanja;
        return kembalian;
    }
    public String qris(){
        return "Berhasil membayar "+"\n"+"kembalian anda : " + kembalian;
    }

    
    @Override
    public double BayarEwallet(int idUser, String namaProvideWalet, 
	double saldo, double totalBelanja) {   
        kembalian = saldo-totalBelanja;
        return kembalian;
    }
    public String ewallet(){
        return "Berhasil membayar "+"\n"+"kembalian anda : " + kembalian;
    }

    
    @Override
    public double BayarCreditCard(int idNasabah, String namaBank, int cardNumber, double saldo, double totalBelanja) {
        kembalian = saldo-totalBelanja;
        return kembalian;
    }
    public String credit(){
        return "Berhasil membayar "+"\n"+"kembalian anda : " + kembalian;
    }

    
    @Override
    public double BayarDebitCard(int idNasabah, String namaBank, int cardNumber, double saldo, double totalBelanja) {
       kembalian = saldo-totalBelanja;
        return kembalian;
    }
    public String debit(){
        return "Berhasil membayar "+"\n"+"kembalian anda : " + kembalian;
    }

    @Override
    public double bayarGoPay(int idUser, double saldo, double belanjaTotal) {
        kembalian = saldo-belanjaTotal;
        return kembalian;
    }
    public String gopay(){
        return "Berhasil membayar "+"\n"+"kembalian anda : " + kembalian;
    }

    @Override
    public double bayarShopeePay(int idUser, double saldo, double belanjaTotal) {
        kembalian = saldo-belanjaTotal;
        return kembalian;
    }
    public String sopipay(){
        return "Berhasil membayar "+"\n"+"kembalian anda : " + kembalian;
    }
}

