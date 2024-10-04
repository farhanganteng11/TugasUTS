/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hotelreservasi;

/**
 *
 * @author Administrator
 */
public interface Reservasi {
    void pesanKamar(String namaCustomer, String tipeKamar);
    void cekKetersediaan();
    void lihatDetailPesanan();
}
