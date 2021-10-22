package com.company;


public class CSSZ {
    private int year;
    private int VOSCount;
    private int VSCount;
    private int ZAKCount;
    private int SOCount;
    private int USOCount;

    public CSSZ(int year, int VOSCount, int VSCount, int ZAKCount, int SOCount, int USOCount) {
        this.year = year;
        this.VOSCount = VOSCount;
        this.VSCount = VSCount;
        this.ZAKCount = ZAKCount;
        this.SOCount = SOCount;
        this.USOCount = USOCount;
    }

    public double getRatio(String a){
        double total = getVOSCount() + getVSCount() + getZAKCount() + getSOCount() + getUSOCount();
        if (a.equals("VOS")) {
            return getVOSCount() / total;
        }
        if (a.equals("VS")) {
            return getVSCount() / total;
        }
        if (a.equals("ZAK")) {
            return getZAKCount() / total;
        }
        if (a.equals("SO")) {
            return getSOCount() / total;
        }
        if (a.equals("USO")) {
            return getUSOCount() / total;
        } return 0;
    }

    public int getVOSCount() {
        return VOSCount;
    }
    public int getVSCount() {
        return VSCount;
    }
    public int getZAKCount() {
        return ZAKCount;
    }
    public int getSOCount() {
        return SOCount;
    }
    public int getUSOCount() {
        return USOCount;
    }
}
