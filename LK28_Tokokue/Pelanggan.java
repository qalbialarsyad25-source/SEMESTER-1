package LK28_Tokokue;

class Pelanggan {
    private String nama;
    private boolean member;

    public Pelanggan(String nama, Boolean member) {
        this.nama = nama;
        this.member = member;
    }

    public String getNama() {
        return nama;
    }
    
    public boolean getMember(){
        return member;
    }
}