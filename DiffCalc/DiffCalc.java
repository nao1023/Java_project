package DiffCalc;
import java.lang.Math;

public class DiffCalc {
  public static void main(String[] args) {
    double b=3.0;
    double x0=0.1;
    double dt=0.01;
    double N;
    double[] malthus1=new double[100];
    double[] malthus2=new double[50];
    // for(int k=1;k<=100;k++){
    //   N=k/100.00;
    //   x0=x0+b*x0*dt;
    //   if(k%2==0) malthus1[(k-1)/2]=Math.abs(x0-0.10*Math.exp(3.0*dt*k));
    //   malthus1[k-1]=Math.abs(x0-0.10*Math.exp(3.0*dt*k));
    //   System.out.println(N+"\t"+malthus1[k-1]);
    // }
    for(int k=1;k<=50;k++){
      N=k/50.00;
      x0=x0+b*x0*dt*2;
      malthus2[k-1]=Math.abs(x0-0.10*Math.exp(3.0*dt*2*k));
      System.out.println(N+"\t"+malthus2[k-1]);
    }
    // for(int k=1;k<=50;k++){
    //   N=k/50.00;
    //   System.out.println(N+"\t"+malthus2[k-1]/malthus1[k-1]);
    // }
  }
}
