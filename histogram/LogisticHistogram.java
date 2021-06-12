package histogram;
public class LogisticHistogram {
  public static void main(String[] args) {
    int j, N=20, T=10000;
    int n[]=new int[N];
    double a=0.0,b=1.0,x=0.1,d;
    d=(b-a)/N;
    for(int i=0;i<N;i++){
      n[i]=0;
    }
    for(int t=0;t<T;t++){
      x=4*x*(1-x);
      j=(int)((x-a)/d);
      n[j] +=1;
    }
    for(int i=0;i<20;i++){
      System.out.println((a+(i+0.5)*d)+"\t"+n[i]/d/T);
    }
  }
}
