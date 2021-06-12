package LogisticEq;
public class LogisticEq1 {
  public static void main(String[] args) {
    double a1,a2,N;
    double b=3.0;
    double x0=0.1;
    double dt=0.01;

    for(int k=1;k<=200;k++){
      N=k/100.00;
      a1=b*x0*(1-x0);
      a2=b*(x0+a1*dt)*(1-x0-a1*dt);
      x0=x0+(a1+a2)*dt/2;

      System.out.println(N+"\t"+x0);
      System.out.println();
    }
  }
}
