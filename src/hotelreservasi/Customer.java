/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservasi;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Customer extends User implements Reservasi {
    private ArrayList<Kamar> kamarDipesan = new ArrayList<>();
    private ArrayList<Kamar> daftarKamar;

    public Customer(String nama, ArrayList<Kamar> daftarKamar) {
        super(nama);  // Call constructor of superclass User
        this.daftarKamar = daftarKamar;
    }

    public void pesanKamar(String namaCustomer, String tipeKamar) {
        for (Kamar kamar : daftarKamar) {
            if (kamar.getTipeKamar().equalsIgnoreCase(tipeKamar) && kamar.isTersedia()) {
                kamarDipesan.add(kamar);
                kamar.setTersedia(false);
                System.out.println("Kamar berhasil dipesan untuk: " + namaCustomer);
                return;
            }
        }
        System.out.println("Kamar tidak tersedia.");
    }

    public void cekKetersediaan() {
        System.out.println("Ketersediaan Kamar:");
        for (Kamar kamar : daftarKamar) {
            System.out.println(kamar.getTipeKamar() + " - " + (kamar.isTersedia() ? "Tersedia" : "Tidak tersedia"));
        }
    }

    public void lihatDetailPesanan() {
        System.out.println("Pesanan Kamar untuk " + nama + ":");
        for (Kamar kamar : kamarDipesan) {
            System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        }
    }
}
