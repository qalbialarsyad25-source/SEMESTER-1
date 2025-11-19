package LK27_Perpustakaan;
import java.util.*;

class Buku {
    private String judul;
    private List<Author> authors;
    private String kategori;

    public Buku(String judul, String kategori, List<Author> authors){
        this.judul = judul;
        this.kategori = kategori;
        this.authors = authors;
    }

    public String getTitle(){
        return judul;
    }

    public List<Author> getAuthors(){
        return authors;
    }

    public String getKategori(){
        return kategori;
    }
}
