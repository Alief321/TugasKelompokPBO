
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class KodeKab <T> extends Kode <T> {
    private ArrayList<String> daftarNama = new ArrayList<>();
    
    public KodeKab(String nama, String id, T value, int length) {
        super(nama,id,value,length);
    }
   
    public void addKecamatan(KodeKec kodeKec){
        this.daftarNama.add(kodeKec);
    }
    
    public ArrayList getKecamatanList(){
        return daftarNama;
    }
    
    @Override
    public String toString(){
        return "Kode Kec = "+getNama();
    }  
}
