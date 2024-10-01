package Exception;

public class NestedTry1 {
    public static void main(String args[]){
        try { // Blok try utama, berisi kode yang mungkin melempar exception
            int a[] = new int[2]; // Membuat array integer dengan jumlah elemen atau indeks + 2
            try { // Blok try kedua, berisi kode yang mungkin melempar exception
                int b = 0; 
                int c = 1/b; 
            } catch (Exception e) { // Blok catch kedua, catch exception ArithmeticException
                System.out.println("Exception thrown: " + e); // menampilkan pesan error jika ada exception
            }
            System.out.println("Access element three: " + a[3]); // Mencoba mengakses elemen ke-3 dari array a, yang akan throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){ // Blok catch utama, catch exception ArrayIndexOutOfBoundsException
            System.out.println("Exception thrown: " + e); // menampilkan pesan error jika exception terjadi
        }
        System.out.println("Out of the block"); // menampilkan pesan jika kode telah selesai dijalankan
    }
}
