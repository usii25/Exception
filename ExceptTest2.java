package Exception;

public class ExcepTest {

    public static void main(String args[]) {
        try {
            int a[] = new int[2]; //Mendeklarasi integer array dengan jumlah elemen 2
            int b = 0;
            int c = 1 / b;
            System.out.println("Access element three :" + a[3]);
            //Mencoba untuk mengakses elemen atau indeks ke-3 yang menyebabkan exception (Out Of Bounds)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown : " + e);
             //catch ini menangkap ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Exception thrown :" + e);
            //catch ini menangkap exception lainnya. Termasuk ArithmeticException
        }
        System.out.println("Out of the block");
        //mencetak pesan "Out of the block" ketika semua telah dijalankan
    }
}
