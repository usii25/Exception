package Exception;

public class Throw {
  public static void main(String args[]) {
    int a = 3;
    int b = 0;
    try {
      System.out.println("result:" + divide(a,b));
    } catch (Exception e) {
        System.out.println("Exception:" + e);
    }
  }

  private static int divide(int a, int b) throw Exception {
    if(b == 0) {
      throw new Exception("second argument cannot be zero.");
    }
    return a / b;
  }
}
