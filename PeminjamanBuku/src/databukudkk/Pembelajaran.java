/**
 * class Pembelajaran dibuat dengan menggunakan konsep abstract class dan inheritance.
 * Dalam konsep inheritance, class ini berperan sebagai subclass.
 * Class ini berisi method yang mengoverride method abstarct yang ada di class Buku (konsep abstract).
 * Class ini juga mewarisi method tidak abstract yang ada di class Buku (konsep inheritance).
 * 
 * @author (Margfirah-2108107010021)
 * @version (19-11-2022)
 */
package databukudkk;

public class Pembelajaran extends Buku {
    private String materi;
    private String tingkatan;

    public Pembelajaran() {
        super();
    }

    public Pembelajaran(String materi, String tingkatan, String judul, String author, int halaman, String penerbit, int harga, int stok, int hargaperhari) {
        super(judul, author, halaman, penerbit, harga, stok, hargaperhari);
        this.materi = materi;
        this.tingkatan = tingkatan;
    }

    public String getMateri(){
        return materi;
    }

     public String getTingkatan(){
        return tingkatan;
    }

    @Override
    public String deskripsi() {
        return "Buat belajar...";
    }
}