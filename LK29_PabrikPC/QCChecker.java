package LK29_PabrikPC;

import java.util.*;

class QCChecker {
    public static boolean cek(PC pc) {
        if (pc.getRAM() < 8){
            return false;
        }
        
        if (pc.getSTORAGE() < 256){
            return false;
        }
        
        if (pc.getCPU().equalsIgnoreCase("Pentium")){
            return false;
        }
        return true;
    }
}