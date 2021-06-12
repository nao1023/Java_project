import java.util.*;

public class Sort {
  public static void main(String[] args) {
    int N=10000;
    double x[] = new double[N+1];
    for(int i=1;i<=N;i++){
      x[i] = Math.pow(Math.random(), 1/3.);
    }
    Arrays.sort(x);
    for(int i=1;i<=N;i++){
      System.out.println(x[i]+"\t"+(i/(double)N));
    }
  }
}
