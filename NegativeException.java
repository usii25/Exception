package Exception;
import java.util.Scanner;
public class NegativeException {
   public static void main(String[] args) {
        try { // try digunakan untuk menangkap pengecualian yang mungkin terjadi
            Scanner scn = new Scanner(System.in); // Membuat objek Scanner untuk mengambil input dari pengguna
            System.out.println("Enter your positive number: "); // Menampilkan pesan untuk meminta pengguna memasukkan angka
            int number = scn.nextInt(); // Mengambil input pengguna berupa angka dan menyimpannya dalam variabel 'number'
            if (number < 0) { // Mengecek apakah angka yang dimasukkan negatif
                throw new Exception("Negative number is not allowed."); // Jika angkanya negatif, pengecualian dilempar dengan pesan "Negative number is not allowed."
            }
            System.out.println("You've entered: " + number); // Jika pengecualian tidak dilempar (angka positif), maka pesan ini ditampilkan
        } catch (Exception e) { // Blok catch menangkap pengecualian yang dilempar dari blok try
            System.out.println("Your number can't be negative."); // Menampilkan pesan jika pengguna memasukkan angka negatif
        }
    }
}
