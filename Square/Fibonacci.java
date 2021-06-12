package Square;
public class Fibonacci {
  public static void main(String[] args) throws Exception {
    for (int n=0;n<20;n++){
      System.out.println(fibonacci(n));
    }
  }
  private static int fibonacci(int n) {
    if (n==0){
      return 0;
    }
    if (n==1){
      return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
}
