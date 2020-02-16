package com.baris;

public class Personel {
    private String isim;
    private String soyisim;
    private int yas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0)
        {
            this.yas=0;
        }
        else {
            this.yas = yas;
        }
    }
    public  String getKimlikBilgileri()
    {
        return  "İd information : Name " + isim
                + "Surname : " + soyisim
                + "Age : " + yas;

    }

    public Personel(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
    }
}
