package LogisticEq;

public class Logistic {
  public static void main(String[] args) {
    int s=60;
    double x[]=new double[s];
    double y[]=new double[s];
    double pi=Math.PI;
    for (int i=0;i<s-1;i++){
      x[0]=(1-Math.cos(pi*(pi-3)))/2;
      y[0]=Math.acos(1-2*x[0])/pi;
      x[i+1]=4*(1-x[i])*x[i];
      y[i+1]=Math.acos(1-2*x[i+1])/pi;
    }
    for (int n=0;n<s;n++){
      int IntegerPart = (int)y[n]; //整数部分のみ抽出
      y[n] -= (double)IntegerPart; //整数部分を消す
      String N = Integer.toBinaryString(IntegerPart); //文字列に変換
      int data[] = {0,1}; //0,1のみの配列

      for(int k = 0; k < 20; k++){
          if(k == 0){
              System.out.print(N + "."); //整数部分を出力
          }
          else{
              System.out.print(data[(int)y[n] % 2]); //2で割ったときの余りが0ならdata[0]、1ならdata[1]を出力
          }
          y[n] *= 2.0;
      }
      System.out.println();
    }
  }
}
