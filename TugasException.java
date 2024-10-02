package Exception;

import java.util.Scanner; 

public class TugasException {

    public static void main(String[] args) throws ArithmeticException {
        Scanner input = new Scanner(System.in); 

        System.out.println("Masukan Nama Anda: "); 
        String a = input.nextLine(); 
        char[] huruf = a.toCharArray(); 
        for (char c : huruf) { 
            if (Character.isDigit(c)) { 
                throw new ArithmeticException("Format Nama Harus Menggunakan Huruf!"); 
            }
        }
        System.out.println("Masukan Umur Anda: "); 
        int b = input.nextInt(); 
        if (b >= 0) { 
            System.out.println("Nama Anda: " + a); 
            System.out.println("Umur Anda: " + b); 
        } else { 
            throw new ArithmeticException("Format Umur Harus Menggunakan Angka!"); 
        }
    }
}
