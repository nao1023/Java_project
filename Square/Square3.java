package Square;
public class Square3 {
  public static void main(String[] args) {
    int x0=0;
    int y0=1;
    int a[] = new int[10];
    a[0] = 0; 
    a[1] = 1;
    for(int n=1;n<=2;n++){
      if (n>=2){
        a[n] = a[n-1]+a[n-2];
      }
      int x1=x0+a[n]; 
      int y1=y0-a[n];
      System.out.println(x0+"\t"+y0);
      System.out.println(x0+"\t"+y1);
      System.out.println(x1+"\t"+y1);
      System.out.println(x1+"\t"+y0);
      System.out.println(x0+"\t"+y0);
      x0=x1;
      y0=y1;
    }
  }
}
