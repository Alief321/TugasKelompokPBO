/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author hp
 * @param <T>
 */
public class KodeProv <T> extends Kode <T>{
    private ArrayList<String> daftarNama = new ArrayList<>();

    public KodeProv(String nama, String id, T value, int length) {
        super(nama,id,value,length);
    }
    public void addKabupaten(KodeKab kodeKab){
        this.daftarNama.add(kodeKab.getNama());
    }
    public ArrayList getKabupatenList(){
        return daftarNama;
    }
    
    @Override
    public String toString(){
        return "Kode Kab = "+getNama();
    }  
}
