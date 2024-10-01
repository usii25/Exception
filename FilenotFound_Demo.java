package Exception;

import java.io.File;
import java.io.FileReader;

public class FilenotFound_Demo {

    public static void main(String args[]) {
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
            //mencoba membuka file "E://file.txt" menggunakan `FileReader`
        } catch (Exception e) {
            System.out.println("Ada Kesalahan");
            //jika tidak ditemukan atau terdapat kesalahan, exception akan diambil oleh catch dan mencetak pesan "Ada Kesalahan"
        }
    }
}
