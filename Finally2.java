package Exception;

Public class Finally2{
	
	Public static void main(String args[]){
	  int a[] = new[2]; // membuat array berukuran 2
      try{
	      System.out.println(“Access element three: “ + a[3]); //mencoba mengakses elemen atau indeks ke 3 yang membuat exception (OutOfBounds)
      }catch(ArithmeticException e){ //catch ini untuk menangani 'ArithmeticException'
	      System.out.println(“Exception thrown :” + e); //pesan ini dicetak jika terjadi pengecualian
      }finally{ // membuat finally statement
	      a[0] = 6; // Array 'a' diindeks 0 diisi dengan nilai 6
		  System.out.println(“First element value: ” + a[0]); // Mencetak nilai dari elemen pertama array, yaitu '6'
		  System.out.println(“The finally statement is executed”); // Mencetak pesan bahwa blok 'finally' telah dieksekusi
  }
}
