package Exception;

public class ExcepTest3 {

    public static void main(String[] args) {
        try {
            int a[] = new int[2]; //Mendeklarasi integer array dengan jumlah elemen = 2
            int b = 0;
            int c = 1 / b;
            System.out.println("Access element three :" + a[3]);
             //Mencoba untuk mengakses elemen atau indeks ke-3 yang menyebabkan exception (Out Of Bounds)
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception throw : " + e);
            //catch ini akan menangkap ArrayIndexOutOfBoundsException dan juga exception lainnya seperti ArithmeticException secara bersamaan
        }
        System.out.println("Out of the block");
        //mencetak pesan "Out of the block" ketika semua program telah dijalankan
    }
}
