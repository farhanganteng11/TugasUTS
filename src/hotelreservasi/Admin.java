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
public class Admin extends User {
    private ArrayList<Kamar> daftarKamar;

    public Admin(String nama, ArrayList<Kamar> daftarKamar) {
        super(nama);  
        this.daftarKamar = daftarKamar;
    }

    public void lihatSemuaKamar() {
        System.out.println("Daftar Semua Kamar:");
        for (Kamar kamar : daftarKamar) {
            System.out.println(kamar.getTipeKamar() + " - " + (kamar.isTersedia() ? "Tersedia" : "Tidak tersedia"));
        }
    }
}
