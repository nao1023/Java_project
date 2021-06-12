package histogram;
import java.util.*;

public class Histogram1 {
  public static void main(String[] args) {
    int T=10000;
    double x[]=new double[T];
    for(int t=0;t<T;t++){
      x[t]=Math.random();
    }
    Arrays.sort(x);
    for(int i=0;i<T;i++){
      System.out.println(x[i]+"\t"+(i/(double)T));
    }
  }
}
