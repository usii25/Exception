package Exception;

public class Throw {
  public static void main(String args[]) {
    int a = 3;
    int b = 0;
    try { //Memulai blok try, untuk melakukan operasi yang mungkin melempar pengecualian.
      System.out.println("result:" + divide(a,b)); //Memanggil metode 'divide' dengan argumen 'a' dan 'b', dan mencetak hasilnya.
    } catch (Exception e) { //menangkap pengecualian jika metode 'divide' melempar pengecualian.
        System.out.println("Exception:" + e); // Mencetak pesan pengecualian jika terjadi error.
    }
  }

  // membuat method divide dengan 2 parameter a dan b
  private static int divide(int a, int b) throw Exception {  // Mendeklarasikan metode 'divide' yang melempar pengecualian
    if(b == 0) { // Mengecek apakah nilai 'b' samadengan 0
      throw new Exception("second argument cannot be zero."); // Jika 'b' samadengan 0, lempar pengecualian dengan pesan "second argument cannot be zero."
    }
    return a / b; // Jika 'b' tidak sama dengan 0, kembalikan hasil pembagian 'a' dengan 'b'
  }
}
