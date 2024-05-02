package TugasPoli;

import java.util.*;

class main{
    public static void main(String[] args) {

        // Memasukkan banyak pegawai
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak pegawai : ");
        int banyakPegawai = sc.nextInt();
        sc.nextLine();
        Pegawai[] listPegawais = new Pegawai[banyakPegawai];

        // Forloop
        for (int i = 0; i < banyakPegawai; i++) {
            // Inisialisasi
            String namaPegawai;
            String KTP;

            // Jenis Pegawai
            System.out.println("Masukkan Jenis Pegawai");
            System.out.println("1. Pegawai Tetap");
            System.out.println("2. Pegawai Harian");
            System.out.println("3. Sales");
            System.out.print("Jenis Pegawai : ");
            int jenisPegawai = sc.nextInt();
            sc.nextLine();
            switch (jenisPegawai) {
                case 1:
                    // Print user diminta memasukkan input
                    System.out.println("Masukkan Identitas dari Pegawai");
                    System.out.print("Nama pegawai : ");
                    namaPegawai = sc.nextLine();
                    System.out.print("No. KTP : ");
                    KTP = sc.nextLine();
                    System.out.print("Gaji : ");
                    double gaji = sc.nextDouble();
                    listPegawais[i] = new PegawaiTetap(namaPegawai, KTP, gaji);

                    break;
                case 2:
                    // Print user diminta memasukkan input
                    System.out.println("Masukkan Identitas dari Pegawai");
                    System.out.print("Nama pegawai : ");
                    namaPegawai = sc.nextLine();
                    System.out.print("No. KTP : ");
                    KTP = sc.nextLine();
                    System.out.print("Upah per Jam : ");
                    double upahPerJam = sc.nextInt();
                    System.out.print("Total jam bekerja : ");
                    int jamKerja = sc.nextInt();
                    listPegawais[i] = new PegawaiHarian(namaPegawai, KTP, upahPerJam, jamKerja);
                    
                    break;
                case 3:
                    // Print user diminta memasukkan input
                    System.out.println("Masukkan Identitas dari Pegawai");
                    System.out.print("Nama pegawai : ");
                    namaPegawai = sc.nextLine();
                    System.out.print("No. KTP : ");
                    KTP = sc.nextLine();
                    System.out.print("Penjualan : ");
                    int penjualan = sc.nextInt();
                    System.out.print("Komisi : ");
                    int Komisi = sc.nextInt();
                    listPegawais[i] = new Sales(namaPegawai, KTP, penjualan, Komisi);
                    
                    break;
                default:
                    break;
            }
        }
        // List ngeprint
        for (int j = 0; j < banyakPegawai; j++) {
            listPegawais[j].print();
        }
    }
}