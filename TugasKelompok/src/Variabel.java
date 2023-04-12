/**
 * Kelompok 1:
 * 1. Adib Sulthon Muammal (222111840)
 * 2. Adinda Ayu Pramesthi (222111843)
 * 3. Aisyah Devyta Maharani (222111869)
 * 4. Aliefta Zulvansyah Bahyperdana (222111873)
 * 5. Almira Utami (222111877)
 */
interface Variabel <T>{
       public String getNama();
        public void setNama(String nama);
        public String getId();
        public void setId(String id);
        public T getValue();
        public void setValue(T value);
        public boolean emptyError(T value) throws InputError;
}
