package histogram;
import java.util.*;

public class HistogramNew {
  public static void main(String[] args) {
    int j, N=20, T=1000000;
    int n[]=new int[N];
    double a=0.0,b=1.0,d;
    double x[]=new double[T];
    d=(b-a)/N;
    for(int i=0;i<N;i++){
      n[i]=0; //初期化
    }
    for(int t=0;t<T;t++){
      x[t]=Math.pow(Math.random(), 1/3.); //データ分布、総数10000個
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1;
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1;
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1;
      x[t]=(x[t] < 0.5)? 2*x[t]:2*x[t]-1;
    }
    Arrays.sort(x); //小さい順に並び替え
    for(int t=0;t<T;t++){
      j=(int)((x[t]-a)/d);
      n[j] +=1; //データをN等分したものに入れていく
    }
    for(int i=0;i<20;i++){
      System.out.println((a+(i+0.5)*d)+"\t"+n[i]/d/T);
    }
  }
}
