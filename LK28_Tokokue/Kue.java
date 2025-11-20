package LK28_Tokokue;

class Kue {
    private String nama;
    private double harga;

    public Kue(int kode) {
        switch(kode){
            case 1:
                this.nama = "Kue Tart";
                this.harga = 150000;
                break;
            case 2:
                this.nama = "Cheese Cake";
                this.harga = 180000;
                break;
            case 3:
                this.nama = "Brownies";
                this.harga = 100000;
                break;
            default:
                this.nama = "Tidak Diketahui";
                this.harga = 0;
                break;
        }
    }

    public String getNama(){
        return nama;
    }
    
    public double getHarga(){
        return harga;
    }
}