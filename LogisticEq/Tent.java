package LogisticEq;
import java.lang.Math;

public class Tent {
  public static void main(String[] args) {
    int s=60;
    double[] x=new double[s];
    
    for (int i=0;i<s-1;i++){
      x[0]= Math.PI-3;
      // System.out.print(x);
      x[i+1]=(x[i]<0.5)? 2*x[i] : 2-2*x[i];

      // System.out.println("\t"+x);
      // System.out.println();
    }

    for (int n=0;n<s;n++){
      int IntegerPart = (int)x[n];
      x[n] -= (double)IntegerPart;
      String bin = Integer.toBinaryString(IntegerPart);
  
      int []data = {0,1};
  
      for(int k = 0; k < 20; k++){
          if(k == 0){
              System.out.print(bin + ".");
          }
          else{
              System.out.print(data[(int)x[n] % 2]);
          }
          x[n] *= 2.0;
      }
      System.out.println();  
    }
  }
}