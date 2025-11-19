package LK27_Perpustakaan;
import java.util.*;

class Kategori {
    private String nama;
    private List<Buku> BUKU = new ArrayList();

    public Kategori(String nama){
        this.nama = nama;
    }

    public void addbuku(Buku b){
        BUKU.add(b);
    }

    public String getNama(){
        return nama;
    }

    public List<Buku> getBUKU(){
        return BUKU;
    }
}
