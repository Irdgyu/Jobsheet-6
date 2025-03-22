import java.util.Scanner;
public class MainDosen06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        DataDosen06 daftar = new DataDosen06();
        
        System.out.println("Masukkan data untuk 10 dosen:");
        for (int i = 0; i < 10; i++) {
            System.out.print("\nKode Dosen: ");
            String kode = input6.nextLine();
            System.out.print("Nama Dosen: ");
            String nama = input6.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = input6.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia: ");
            int usia = input6.nextInt();
            input6.nextLine();

            daftar.tambah(new Dosen06(kode, nama, jenisKelamin, usia));
        }
        System.out.println("\nData sebelum sorting:");
        daftar.tampil();
        daftar.ASC();
        System.out.println("\nData setelah Sorting ASC (Usia Termuda → Tertua):");
        daftar.tampil();
        daftar.DSC();
        System.out.println("\nData setelah Sorting DSC (Usia Tertua → Termuda):");
        daftar.tampil();
    }
}
