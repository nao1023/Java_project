package DiffCalc;
public class DiffCalc1 {
  public static void main(String[] args) {
    double a1,a2,N;
    double b=3.0;
    double x0=0.1000;
    double dt=0.01;
    double[] malthus1=new double[100];
    double[] malthus2=new double[50];

    // for(int k=1;k<=100;k++){
    //   N=k/100.00;
    //   a1=b*x0;
    //   a2=b*(x0+a1*dt);
    //   x0=x0+(a1+a2)*dt/2;
    //   if(k%2==0) malthus1[(k-1)/2]=Math.abs(x0-0.10*Math.exp(3.0*dt*k));
    //   malthus1[k-1]=Math.abs(x0-0.1000*Math.exp(3.0000*dt*k));
    //   System.out.println(N+"\t"+malthus1[k-1]);
    // }
    for(int k=1;k<=50;k++){
      N=k/50.00;
      a1=b*x0;
      a2=b*(x0+a1*dt*2);
      x0=x0+(a1+a2)*dt*2/2;
      malthus2[k-1]=Math.abs(x0-0.10*Math.exp(3.0*dt*2*k));
      System.out.println(N+"\t"+malthus2[k-1]);
    }
    // for(int k=1;k<=50;k++){
    //   N=k/50.00;
    //   System.out.println(N+"\t"+malthus2[k-1]/malthus1[k-1]);
    // }
  }
}
