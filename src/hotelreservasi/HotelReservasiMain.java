/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelreservasi;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class HotelReservasiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Kamar> daftarKamar = new ArrayList<>();
        daftarKamar.add(new Kamar("Single"));
        daftarKamar.add(new Kamar("Double"));
        daftarKamar.add(new Kamar("Suite"));

        Scanner scanner = new Scanner(System.in);

        // Input access level
        System.out.print("Masukkan level akses (admin/customer): ");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            System.out.print("Masukkan nama admin: ");
            String namaAdmin = scanner.nextLine();
            Admin admin = new Admin(namaAdmin, daftarKamar);
            admin.lihatSemuaKamar();
        } else if (role.equalsIgnoreCase("customer")) {
            System.out.print("Masukkan nama customer: ");
            String namaCustomer = scanner.nextLine();
            Customer customer = new Customer(namaCustomer, daftarKamar);

            int pilihan;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Pesan Kamar");
                System.out.println("2. Cek Ketersediaan");
                System.out.println("3. Lihat Detail Pesanan");
                System.out.println("4. Keluar");
                System.out.print("Pilih: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan tipe kamar (Single/Double/Suite): ");
                        String tipeKamar = scanner.nextLine();
                        customer.pesanKamar(namaCustomer, tipeKamar);
                        break;
                    case 2:
                        customer.cekKetersediaan();
                        break;
                    case 3:
                        customer.lihatDetailPesanan();
                        break;
                    case 4:
                        System.out.println("Selamat menikmati kamarnya ya!");
                        System.out.println("Keluar...");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 4);
        } else {
            System.out.println("Level akses tidak dikenali.");
        }

        scanner.close();
    }
    }
  
