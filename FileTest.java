package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

    public static void main(String args[]) {
        try {
            File file = new File("d://test//testFile1.txt"); // Membuat objek File baru dengan path yang ditentukan

            // Create the file
            if (file.createNewFile()) { // Membuat file baru jika belum ada
                System.out.println("File is created!"); // Menampilkan pesan jika file berhasil dibuat
            } else {
                System.out.println("File already exists."); // Menampilkan pesan apabila file sudah ada
            }

            // Write Content
            FileWriter writer = new FileWriter(file); // Membuat objek FileWriter untuk menulis ke file
            writer.write("Test data"); // Menulis data ke file
            writer.close(); // Menutup objek FileWriter

            // Read content
            FileReader reader = new FileReader(file); // Membuat objek FileReader untuk membaca file

            int c;
            while ((c = reader.read()) != -1) { // Membaca isi file karakter per karakter
                char ch = (char) c;
                System.out.print(ch); // Mencetak isi file ke console
            }
            reader.close();
        } catch (IOException e) { // Blok catch, menangkap exception IOException
            System.out.print("Exception");  // Mencetak pesan error jika terjadi exception
        }
    }
}
