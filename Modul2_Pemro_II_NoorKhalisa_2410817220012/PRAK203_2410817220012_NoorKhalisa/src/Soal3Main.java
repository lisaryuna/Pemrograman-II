public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // pada baris ini error terjadi karena kurangnya titik koma ;
        // p1.nama = "Roi"
        p1.nama = "Roi";
        // pada baris ini, error karena variabel 'asal' itu bukan String, tetapi char di Pegawai.java
        // sudah tidak error karena char diganti jadi string
        p1.asal = "Kingdom of Orvel";
        // pada baris ini error karena setJabatan yang ada di Pegawai.java tidak memiliki parameter
        p1.setJabatan("Assasin");
        // pada kode sebelumnya, umur belum diinisilisasi
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}