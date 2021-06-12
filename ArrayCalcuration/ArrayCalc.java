package ArrayCalcuration;
import java.util.Scanner;

class ArrayCalc {
  public static void main(String args[]){
    int A[][],B[][],C[][];
    int a,b,c,d; //行列のサイズ

    Scanner scan = new Scanner(System.in);
    do{
        System.out.println("行列Ａのサイズを入力してください(行　列)");
        a = scan.nextInt();
        b = scan.nextInt();
    
        System.out.println("行列Ｂのサイズを入力してください（行　列）");
        c = scan.nextInt();
        d = scan.nextInt();
        
        if(b!=c){
            System.out.println("行列の積の定義より、計算できません");
        }
    }while(b!=c);
    
    A = new int[a][b];
    B = new int[c][d];
    C = new int[a][d];
    
    Nyuryoku(A,a,b);
    Hyouzi(A,a,b);
    Nyuryoku(B,c,d);
    Hyouzi(B,c,d);
    Mult(A,B,C,a,d,b); // AB =
    System.out.println("AB =");
    Hyouzi(C,a,d);
}

private static void Nyuryoku(int array[][],int a,int b){
    System.out.println("成分を入力してください");
    Scanner scan = new Scanner(System.in);
    int i,j;
    for(i=0;i<a;i++){
        for(j=0;j<b;j++){
            System.out.print(i+","+j+"成分＝");
            array[i][j] = scan.nextInt();
        }
    }
}

private static void Hyouzi(int array[][],int a,int b){
    int i,j;
    for(i=0;i<a;i++){
        for(j=0;j<b;j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.print("\n");
    }
  }
  
  private static void Mult(int array1[][],int array2[][],int array3[][],int a,int d,int b){
    int i,j,k;
    for(i=0;i<a;i++){ // AB
      for(j=0;j<d;j++){
        for(k=0;k<b;k++){
          array3[i][j] += array1[i][k]*array2[k][j];
        }
      }
    }
  }     
}