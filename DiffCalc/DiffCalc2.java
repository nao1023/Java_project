package DiffCalc;
import java.lang.Math;

public class DiffCalc2 {
  public static void main(String[] args) {
    double b=3.0;
    double x0=0.100;
    double dt=0.01;
    double N;
    double[] logistic1=new double[200];
    double[] logistic2=new double[100];

    // for(int k=1;k<=200;k++){
    //   N=k/100.00;
    //   x0=x0+b*x0*(1-x0)*dt;
    //   logistic1[k-1]=Math.abs(x0-0.1*Math.exp(b*dt*k)/(1-0.1+0.1*Math.exp(b*dt*k)));
    //   System.out.println(N+"\t"+logistic1[k-1]);
    // }

    for(int k=1;k<=100;k++){
      N=k/50.00;
      x0=x0+b*x0*(1-x0)*dt*2;
      logistic2[k-1]=Math.abs(x0-0.1*Math.exp(b*dt*2*k)/(1-0.1+0.1*Math.exp(b*dt*2*k)));
      System.out.println(N+"\t"+logistic2[k-1]);
    }
  }
}
