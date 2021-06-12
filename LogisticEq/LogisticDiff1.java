package LogisticEq;

public class LogisticDiff1 {
  public static void main(String[] args) {
    int n=10000;
    double x=0.4;
    double sum=0,r=3.95;
    double y[]=new double[n];

    for(int k=0;k<n;k++){
      x=r*(1-x)*x;
      y[k]=Math.log(r*Math.abs(1-2*x));
      sum += y[k];
    }
    
    double h=sum/n;
    System.out.println(h);
  }
}
