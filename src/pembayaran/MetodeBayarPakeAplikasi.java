/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pembayaran;

/**
 *
 * @author M S I
 */
public interface MetodeBayarPakeAplikasi extends metodeBayar{
	public double bayarGoPay (int idUser, double saldo, double belanjaTotal);
	public double bayarShopeePay (int idUser, double saldo, double belanjaTotal);
}

