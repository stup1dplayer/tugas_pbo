/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pembayaran;

/**
 *
 * @author M S I
 */
public interface metodeBayar {
     public double BayarCash(double cash, double belanja);
    public double BayarQRIS(int idNabasah, double saldo, double totalBelanja);
    public double BayarEwallet(int idUser, String namaProvideWalet, 
	double saldo, double totalBelanja);
    public double BayarCreditCard(int idNasabah, String namaBank, int cardNumber, double saldo, double totalBelanja);
    public double BayarDebitCard(int idNasabah, String namaBank, int cardNumber, double saldo, double totalBelanja);
}
