package org.example.Type;

public enum PriceType {
    TERAPIA (1),
    CHISTKA(2),
    CORONKI(3),
    VINIRI(4),
    DOP_USLUGI(5),
    UDALENIE(6),
    PROTEZ(7),
    ;

    private final int i;
    PriceType (int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }
}
