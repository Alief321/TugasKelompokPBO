
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class KodeKec <T> extends Kode <T> {
    private ArrayList<String> daftarNama = new ArrayList<>();
    
    public KodeKec(String nama, String id, T value, int length) {
        super(nama,id,value,length);
    }
   
    @Override
    public String toString(){
        return "Kode Kec = "+getNama();
    }  
    
}
