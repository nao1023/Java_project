package LogisticEq;

public class LogisticDiff {
  public static void main(String[] args) {
    int n=20;
    double x=0.4,y=x+0.00000001;
    double h;
    double dx[]=new double[n];

    for(int k=0;k<n;k++){
      x=4*(1-x)*x;
      y=4*(1-y)*y;
      dx[k]=Math.abs(x-y);
      // System.out.println(k+"\t"+dx[k]);
      System.out.println(k+"\t"+Math.log(dx[k]));
    }
    h=(Math.log(dx[n-1])-Math.log(dx[0]))/n;
    System.out.println(h);
  }
}