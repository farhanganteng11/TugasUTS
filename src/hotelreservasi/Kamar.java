/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelreservasi;

/**
 *
 * @author Administrator
 */
public class Kamar {
    private String tipeKamar;
    private boolean tersedia;

    public Kamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
        this.tersedia = true;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
