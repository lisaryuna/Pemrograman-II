// pada baris ini error karena 'Employee' tidak sesuai dengan nama class yang digunakan di Soal3Main.java yaitu 'Pegawai'
// public class Employee
public class Pegawai {
    public String nama;
    // pada baris ini, ganti char menjadi String
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        // pada baris ini error karena yang diambil bukan tipe data String, melainkan char.
        // solusinya bisa dengan mengubah char menjadi string
        return asal;
    }

    // public void setJabatan()
    public void setJabatan(String j) {
        // pada baris ini terjadi error karena setJabatan tidak memiliki parameter sebelumnya
        this.jabatan = j;
    }
}
