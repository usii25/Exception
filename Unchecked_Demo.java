package Exception;

public class Unchecked_Demo {

    public static void main(String[] args) {
        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[4]); //mendeklarasi integer menggunakan array
            //mencoba mengakses elemen array pada indeks ke-4 (`num[4]`) yang menyebabkan exception (out of bounds)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array melebihi batas :" + e);
            //kemudian exception diambil oleh catch dan mencetak pesan "Array melebihi batas"
        }
    }
}
