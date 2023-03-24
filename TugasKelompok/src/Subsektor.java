/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author "AS MUAMMAL"
 */
public class Subsektor {
    private Kode tanamanPangan;
    private Kode holtikultura;
    private Kode perkebunan;
    private Kode kehutanan;
    private Kode peternakan;
    private Kode perikanan;

    public Subsektor(Kode tanamanPangan, Kode holtikultura, Kode perkebunan, Kode kehutanan, Kode peternakan, Kode perikanan) {
        this.tanamanPangan = tanamanPangan;
        this.holtikultura = holtikultura;
        this.perkebunan = perkebunan;
        this.kehutanan = kehutanan;
        this.peternakan = peternakan;
        this.perikanan = perikanan;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
