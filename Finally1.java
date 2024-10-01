package Exception;

Public Finally1{
	Public static void main(String args[]){
		System.out.println(testFinallyBlock()); // memamnggil method testFinallyBlock
	}
}

Private static int testFinallyBlock(){
	Int a[] = new int[2]; // membuat array berukuran 2
  try{
	  Return 1; // mengembalikan nilai 1
  }catch(ArrayIndexOutOfBoundsException e) {	
    System.out.println(“Exception thrown :” + e); // Menangani pengecualian
  }finally {
	  a[0] = 6; // Menetapkan nilai elemen pertama array menjadi 6
		System.out.println(“First element value: ” + a[0]); // Mencetak nilai elemen pertama array
		System.out.println(“The finally statement is executed”);  // Mencetak pesan dari blok finally
    }
    Return 0; // Setelah finally, mengembalikan nilai 0
}
