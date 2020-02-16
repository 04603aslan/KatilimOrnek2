package com.baris;

public class Student
{
    private String isim;
    private String soyisim;
    private  int yas;
    private int ogrenciNo;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public Student() {
        this.isim ="Henüz girilmedi" ;
    }

    public Student(String isim, String soyisim, int yas, int ogrenciNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        if (yas<0)
        {
            this.yas=0;
        }
        else {
            this.yas = yas;
        }
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getOgrenciNo() {
        if (ogrenciNo<0)
        {
            this.ogrenciNo=0;
        }
        else {
            this.ogrenciNo = ogrenciNo;
        }
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}
