package Exception;

Public Finally1{
	Public static void main(String args[]){
		System.out.println(testFinallyBlock());
	}
}

Private static int testFinallyBlock(){
	Int a[] = new int[2];
  try{
	  Return 1;
  }catch(ArrayIndexOutOfBoundsException e) {	
    System.out.println(“Exception thrown :” + e);
  }finally {
	  a[0] = 6;
		System.out.println(“First element value: ” + a[0]);
		System.out.println(“The finally statement is executed”);
    }
    Return 0;
}
