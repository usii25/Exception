package Exception;

import java.util.Scanner; //Mengimpor kelas Scanner dari java.util untuk mendapatkan input dari pengguna

public class TugasException {

    public static void main(String[] args) throws ArithmeticException {
        Scanner input = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari pengguna

        System.out.println("Masukan Nama Anda: "); // Menampilkan prompt kepada pengguna untuk memasukkan nama
        String a = input.nextLine(); //Membaca input nama pengguna dalam bentuk string
        char[] huruf = a.toCharArray(); //Mengonversi string nama menjadi array karakter
        for (char c : huruf) { //Menggunakan loop for-each untuk memeriksa setiap karakter dalam array 'huruf'
            if (Character.isDigit(c)) { //Memeriksa apakah karakter tersebut adalah angka
                throw new ArithmeticException("Format Nama Harus Menggunakan Huruf!"); //Jika ada karakter yang merupakan angka, lempar pengecualian 'ArithmeticException'
            }
        }
        System.out.println("Masukan Umur Anda: "); //Menampilkan prompt kepada pengguna untuk memasukkan umur
        int b = input.nextInt(); //Membaca input umur pengguna dalam bentuk integer
        if (b >= 0) { //Memeriksa apakah umur yang dimasukkan tidak negatif
            System.out.println("Nama Anda: " + a); // Menampilkan nama pengguna jika format nama sudah benar
            System.out.println("Umur Anda: " + b); // Menampilkan nama pengguna jika format umur valid
        } else { //Jika umur negatif atau tidak valid, jalankan blok ini
            throw new ArithmeticException("Format Umur Harus Menggunakan Angka!"); // Lempar pengecualian 'ArithmeticException' jika umur yang dimasukkan negatif atau tidak valid
        }
    }
}
