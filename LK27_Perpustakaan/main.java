package LK27_Perpustakaan;

import java.util.*;

public class main {

     static List<Author> a (String... nama) {
            List<Author> list = new ArrayList<>();
            for (String n : nama){ 
                list.add(new Author(n));
            }
            return list;
        }
    public static void main(String[] args) {

        // Membuat kategori
        Kategori teknologi = new Kategori("Teknologi");
        Kategori filsafat = new Kategori("Filsafat");
        Kategori sejarah = new Kategori("Sejarah");
        Kategori agama = new Kategori("Agama");
        Kategori psikologi = new Kategori("Psikologi");
        Kategori politik = new Kategori("Politik");
        Kategori fiksi = new Kategori("Fiksi");
       
        // ========= TAMBAHKAN 5 BUKU PER KATEGORI =========
        teknologi.addbuku(new Buku("Dasar Pemrograman", "Teknologi", a("Andi")));
        teknologi.addbuku(new Buku("Algoritma Modern", "Teknologi", a("Budi", "Citra")));
        teknologi.addbuku(new Buku("Jaringan Komputer", "Teknologi", a("Rahmat")));
        teknologi.addbuku(new Buku("AI untuk Pemula", "Teknologi", a("Dewi")));
        teknologi.addbuku(new Buku("Cyber Security", "Teknologi", a("Iqbal")));

        filsafat.addbuku(new Buku("Filsafat Moral", "Filsafat", a("Arif")));
        filsafat.addbuku(new Buku("Logika Dasar", "Filsafat", a("Dina")));
        filsafat.addbuku(new Buku("Metafisika", "Filsafat", a("Hendra")));
        filsafat.addbuku(new Buku("Sejarah Pemikiran Barat", "Filsafat", a("Siti")));
        filsafat.addbuku(new Buku("Epistemologi Modern", "Filsafat", a("Rina")));

        sejarah.addbuku(new Buku("Sejarah Dunia", "Sejarah", a("Mahmud")));
        sejarah.addbuku(new Buku("Perang Dunia I", "Sejarah", a("Alya")));
        sejarah.addbuku(new Buku("Kerajaan Nusantara", "Sejarah", a("Akbar")));
        sejarah.addbuku(new Buku("Revolusi Amerika", "Sejarah", a("Fajar")));
        sejarah.addbuku(new Buku("Sejarah Asia", "Sejarah", a("Ratna")));

        agama.addbuku(new Buku("Studi Agama-Agama", "Agama", a("Hafidz")));
        agama.addbuku(new Buku("Pemikiran Islam", "Agama", a("Rahman")));
        agama.addbuku(new Buku("Etika Kristen", "Agama", a("Daniel")));
        agama.addbuku(new Buku("Dasar Hindu", "Agama", a("Komang")));
        agama.addbuku(new Buku("Pemahaman Buddha", "Agama", a("Santi")));

        psikologi.addbuku(new Buku("Psikologi Dasar", "Psikologi", a("Lina")));
        psikologi.addbuku(new Buku("Teori Kepribadian", "Psikologi", a("Putri")));
        psikologi.addbuku(new Buku("Kognitif Manusia", "Psikologi", a("Farhan")));
        psikologi.addbuku(new Buku("Psikologi Sosial", "Psikologi", a("Rasya")));
        psikologi.addbuku(new Buku("Kesehatan Mental", "Psikologi", a("Yuni")));

        politik.addbuku(new Buku("Politik Global", "Politik", a("Rama")));
        politik.addbuku(new Buku("Teori Demokrasi", "Politik", a("Sari")));
        politik.addbuku(new Buku("Sistem Pemerintahan", "Politik", a("Ridho")));
        politik.addbuku(new Buku("Politik Asia", "Politik", a("Arman")));
        politik.addbuku(new Buku("Hukum dan Politik", "Politik", a("Gina")));

        fiksi.addbuku(new Buku("Laskar Pelangi", "Fiksi", a("Andrea Hirata")));
        fiksi.addbuku(new Buku("Harry Potter", "Fiksi", a("J.K. Rowling")));
        fiksi.addbuku(new Buku("Lord of The Rings", "Fiksi", a("Tolkien")));
        fiksi.addbuku(new Buku("Bumi Manusia", "Fiksi", a("Pramoedya")));
        fiksi.addbuku(new Buku("5 cm", "Fiksi", a("Donny Dhirgantoro")));

        // Simpan dalam list agar mudah ditampilkan
        List<Kategori> categories = Arrays.asList(
            teknologi, filsafat, sejarah, agama, psikologi, politik, fiksi
        );

        // ========= TAMPILKAN KE LAYAR =========
        for (Kategori c : categories) {
            System.out.println("\n=== KATEGORI: " + c.getNama() + " ===");
            for (Buku b : c.getBUKU()) {
                System.out.print("Judul: " + b.getTitle() + " | Penulis: ");
                for (Author au : b.getAuthors()) {
                    System.out.print(au.getNama() + " ");
                }
                System.out.println();
            }
        }
    }
}
