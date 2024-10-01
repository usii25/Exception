package Exception;

Public class Finally2{
	
	Public class Finally2{
    
	  Public static void main(String args[]){
		  int a[] = new[2];
      try{
	      System.out.println(“Access element three: “ + a[3]);
      }catch(ArithmeticException e){
	      System.out.println(“Exception thrown :” + e);
      }finally{
	      a[0] = 6;
			  System.out.println(“First element value: ” + a[0]);
			  System.out.println(“The finally statement is executed”);
    }
  }
}
