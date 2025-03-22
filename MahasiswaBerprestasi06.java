public class MahasiswaBerprestasi06 {
    Mahasiswa06[] listMhs;
    int idx;

    MahasiswaBerprestasi06(int kapasitas) {
        listMhs = new Mahasiswa06[kapasitas];
        idx = 0;
    }
    void tambah(Mahasiswa06 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (Mahasiswa06 m : listMhs) {
            if (m != null) { 
                m.tampilInformasi();
                System.out.println("---------------------------");
            }
        }
    }
    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) { 
                    Mahasiswa06 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }
}
