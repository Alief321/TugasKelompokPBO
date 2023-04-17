/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */

public class ChangerType <T> implements Variabel <T> {
    private String nama;
    private String id;
    private T value;
    public ChangerType(){}
    public ChangerType(String nama, String id, T value){
        this.nama = nama;
        this.id = id;
        this.value = value;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    /*public boolean emptyError(T value){
        try {
            if ( getValue()==""){
            throw new InputError(String.format("Variabel %s Kosong", getNama()));
        }
        } catch (InputError e) {
            //System.out.println(Main.ANSI_RED+e+Main.ANSI_RESET);
            throw e;
            return true;
        }
    return false;
    }*/
    public boolean emptyError(T value) throws InputError {
    if (getValue().equals("")) {
        throw new InputError(String.format("Variabel %s Kosong", getNama()));
    }
    return false;
}

    public boolean checkValue() throws InputError {
        if (emptyError(getValue())){
            return false;
        }
        return true;
    }
       public void delete(Object obj){
        obj = null;
    }
}

