package com.example.ziyoda_learing_android;

public class ProductModel {
    String nomi;
    float narxi;
    String sanasi;

    public ProductModel(String nomi, float narxi, String sanasi) {
        this.nomi = nomi;
        this.narxi = narxi;
        this.sanasi = sanasi;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public float getNarxi() {
        return narxi;
    }

    public void setNarxi(float narxi) {
        this.narxi = narxi;
    }

    public String getSanasi() {
        return sanasi;
    }

    public void setSanasi(String sanasi) {
        this.sanasi = sanasi;
    }
}
