import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input6.nextInt();
        input6.nextLine(); 

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM   : ");
            String nim = input6.nextLine();
            System.out.print("Masukkan Nama  : ");
            String nama = input6.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = input6.nextLine();
            System.out.print("Masukkan IPK   : ");
            double ipk = input6.nextDouble();
            input6.nextLine();

            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("\nData mahasiswa sebelum disorting:");
        list.tampil();
        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.bubbleSort();
        list.tampil();
    }
}
