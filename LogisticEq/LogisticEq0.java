package LogisticEq;
public class LogisticEq0 {
  public static void main(String[] args) {
    double N;
    double b=3.0;
    double x0=0.1;
    double dt=0.01;

    for(int k=1;k<=200;k++){
      N=k/100.00;
      x0=x0+b*x0*(1-x0)*dt;

      System.out.println(N+"\t"+x0);
      System.out.println();
    }
  }
}
