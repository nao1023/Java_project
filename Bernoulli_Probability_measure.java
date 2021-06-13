import java.util.*;

public class Bernoulli_Probability_measure {
  public static void main(String[] args) {
    int N=10000;
    double x[]= new double[N+1]; x[0] = 0.0;
    for(int i=1;i<N;i++){
      x[i] = -Math.log(Math.random());
      while(1.0 <= x[i]){
        x[i] -= 1.0;
      }
    }
    x[N] = 1.0;
    for(int t=0;t<N;t++){
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1; //t=1
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1; //t=2
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1; //t=3
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1; //t=4
    }
    Arrays.sort(x);
    for(int n=1;n<=N;n++){
      System.out.println(x[n]+"\t"+(n/(double)N));
    }
  }
}