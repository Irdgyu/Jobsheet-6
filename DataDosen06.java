public class DataDosen06 {
    Dosen06[] dataDosen = new Dosen06[10]; 
    int idx = 0;

    void tambah(Dosen06 dsn) {
        if (idx < 10) {
            dataDosen[idx] = dsn;
            idx++;
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }
    void ASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen06 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    void DSC() { 
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen06 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}
