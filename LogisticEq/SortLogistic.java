package LogisticEq;
import java.util.*;

public class SortLogistic {
  public static void main(String[] args) {
    int N=10000;
    double x[]=new double[N];
    x[0]=0.1;
    for(int t=1;t<N;t++){
      x[t]=4*x[t-1]*(1-x[t-1]);
    }
    Arrays.sort(x);
    for(int i=0;i<N;i++){
      System.out.println(x[i]+"\t"+(i/(double)N));
    }
  }
}