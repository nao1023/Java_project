public class Malthus{
    public static void main(String[] args) {
        double b=3.0;
        double x0=0.1;
        double dt=0.01,N;
        
        for(int k=1;k<=100;k++){
            N=k/100.00;
            x0=x0+b*x0*dt;
            System.out.println(N+"\t"+x0);
            System.out.println();
        }
    }
}