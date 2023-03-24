/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author "AS MUAMMAL"
 */
public class DPP{
    private Kode kunjungan;
    private Kode aktif;

    public DPP(Kode kunjungan, Kode aktif) {
        this.kunjungan = kunjungan;
        this.aktif = aktif;
    }

    public Kode getAktif() {
        return aktif;
    }

    public Kode getKunjungan() {
        return kunjungan;
    }

    public void setAktif(Kode aktif) {
        this.aktif = aktif;
    }

    public void setKunjungan(Kode kunjungan) {
        this.kunjungan = kunjungan;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
