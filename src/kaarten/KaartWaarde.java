package kaarten;

public enum KaartWaarde {
    TWEE(2),
    DRIE(3),
    VIER(4),
    VIJF(5),
    ZES(6),
    ZEVEN(7),
    ACHT(8),
    NEGEN(9),
    TIEN(10),
    BOER(11),
    DAME(12),
    HEER(13),
    AAS(14);

    private int waarde;

    KaartWaarde(int waarde) {
        this.waarde = waarde;
    }

    public int getWaarde() {
        return waarde;
    }
}
