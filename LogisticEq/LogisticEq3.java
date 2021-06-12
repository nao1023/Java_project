package LogisticEq;
public class LogisticEq3 {
  public static void main(String[] args) {
    double a1,a2,a3,a4,N;
    double b=3.0;
    double x0=1.1;
    double dt=0.01;

    for(int k=1;k<=200;k++){
      N=k/100.00;
      a1=b*x0*(1-x0);
      a2=b*(x0+a1*dt/2)*(1-x0-a1*dt/2);
      a3=b*(x0+a2*dt/2)*(1-x0-a2*dt/2);
      a4=b*(x0+a3*dt)*(1-x0-a3*dt);
      x0=x0+(a1+2*a2+2*a3+a4)*dt/6;

      System.out.println(N+"\t"+x0);
      System.out.println();
    }
  }
}
