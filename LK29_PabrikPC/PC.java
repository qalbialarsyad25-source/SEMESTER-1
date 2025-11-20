package LK29_PabrikPC;

class PC {
    private String cpu;
    private int ramGB;
    private int storageGB;
    

    public PC(String cpu, int ramGB, int storageGB) {
        this.cpu = cpu;
        this.ramGB = ramGB;
        this.storageGB = storageGB;
    }
    
    public String getCPU(){
        return cpu;
    }
    
    public int getRAM(){
        return ramGB;
    }
    
    public int getSTORAGE(){
        return storageGB;
    }
}