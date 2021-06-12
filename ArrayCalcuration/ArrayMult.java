package ArrayCalcuration;
import java.lang.Math;

public class ArrayMult {
  public static void main(String[] args) {
    int A[][] = {{0,1,1,0},
                 {-1,-1,1,2},
                 {2,1,-1,-1},
                 {0,1,1,0}};
    int B[][], C[][];
    int a=4,b=4,d=4,i,j,n=0;

    B = new int[a][d];
    C = new int[a][d];
    for(n=0;n<8;n++){
      if(n==0){
        Mult(A,A,B,a,d,b);
        // Print(B,a,b);
      }else{
        Mult(A,B,C,a,d,b);
        for(i=0;i<a;i++){
          for(j=0;j<d;j++){
            B[i][j] = C[i][j];
            C[i][j]=0;
          }
        }
        // Print(B,a,b);
      }
    }
    Print(B,a,b);
    Tr(B,a,9.0);
  }

  private static void Print(int array[][], int a, int b) {
    int i,j;
    for(i=0;i<a;i++){
      for(j=0;j<b;j++){
        System.out.print(array[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
    
  private static void Mult(int array1[][], int array2[][], int array3[][], int a, int d, int b){
    int i,j,k;
    for(i=0;i<a;i++){
      for(j=0;j<d;j++){
        for(k=0;k<b;k++){
          array3[i][j] += array2[i][k]*array1[k][j];
        }
      }
    }
  }
  
  private static void Tr(int array[][], int a, double n){
    int i,t=0;
    double x=0,m=1/n;
    for(i=0;i<a;i++){
      t += array[i][i];
    }
    System.out.println("行列のトレースは"+t);
    if (t<0){
      t *= -1;
    }
    x = Math.pow((double)t, m);
    System.out.print("絶対値最大の固有値は"+x);
  }

}