package DiffCalc;
public class DiffCalc3 {
  public static void main(String[] args) {
    double a1,a2,N;
    double b=3.0;
    double x0=0.1;
    double dt=0.01;
    double[] logistic1=new double[200];
    double[] logistic2=new double[100];

    for(int k=1;k<=200;k++){
      N=k/100.00;
      a1=b*x0*(1-x0);
      a2=b*(x0+a1*dt)*(1-x0-a1*dt);
      x0=x0+(a1+a2)*dt/2;
      logistic1[k-1]=Math.abs(x0-0.1*Math.exp(b*dt*k)/(1-0.1+0.1*Math.exp(b*dt*k)));
      System.out.println(N+"\t"+logistic1[k-1]);
    }

    // for(int k=1;k<=100;k++){
    //   N=k/50.00;
    //   a1=b*x0*(1-x0);
    //   a2=b*(x0+a1*dt*2)*(1-x0-a1*dt*2);
    //   x0=x0+(a1+a2)*dt*2/2;
    //   logistic2[k-1]=Math.abs(x0-0.1*Math.exp(3.0*dt*2*k)/(1-0.1+0.1*Math.exp(3.0*dt*2*k)));
    //   System.out.println(N+"\t"+logistic2[k-1]);
    // }
  }
}
