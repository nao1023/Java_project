package Square;
public class Square0 {
  public static void main(String[] args) {
    int a[] = new int[20];
    a[0] = 0; a[1] = 1;
    System.out.println(a[0]);
    System.out.println(a[1]); 
    for(int n=2; n<20; n++){
      a[n] = a[n-1]+a[n-2];
      System.out.println(a[n]);
    } 
  }
}
