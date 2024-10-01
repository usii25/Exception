package Exception;

public class NestedTry2 {
    public static void main(String[] args) {
        try { // Blok try utama, berisi kode yang mungkin melempar exception
            int a[] = new int[2]; // Membuat array integer dengan jumlah indeks = 2
            try { // Blok try kedua, berisi kode yang mungkin melempar exception
                int b = 0;
                int c = 1/b;
            }catch (ArrayIndexOutOfBoundsException e) { // Blok catch kedua, catch exception ArrayIndexOutOfBoundsException
                System.out.println("Exception thrown: " + e);
            }
            System.out.println("Access element three: " + a[3]); // Mencoba mengakses elemen ke-3 dari array a, yang akan throw ArrayIndexOutOfBoundsException
        } catch (Exception e){ // blok catch pertama, catch exception arithmetic
        System.out.println("Exception thrown: " +e); //Menampilkan pesan error jika exception terjadi
        }
        System.out.println("Out of the block");  // menampilkan pesan jika kode telah selesai dijalankan
    }
}
