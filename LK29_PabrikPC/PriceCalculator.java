package LK29_PabrikPC;

import java.util.*;
class PriceCalculator {
    public static double hitung(PC pc) {
        double hargaCPU = 0;
        
        switch(pc.getCPU()){
            case "i3":
                hargaCPU = 1_000_000;
                break;
            case "i5":
                hargaCPU = 1_500_000;
                break;
            case "i7":
            case "RYZEN 7":
            case "Ryzen 7":
                hargaCPU = 2_500_000;
                break;
            default:
                hargaCPU = 1_200_000;
                break;
        }
        
        double hargaRAM = 50_000 * pc.getRAM();
        double hargaSTORAGE = 3_000 * pc.getSTORAGE();
        
        return hargaCPU + hargaRAM + hargaSTORAGE;
    }
}