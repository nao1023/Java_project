public class Arith1 {
  public static void main(String[] args) {
    int i,j,k;
    i=j=3; k=2;
    System.out.println("(1)\ti+k="+(i+k)+"\ti-k="+(i-k)+"\ti*k="+(i*k)+"\ti/k="+(i/k)+"\ti%k="+(i%k));
    i=i+k; j+=k;
    System.out.println("(2)\ti="+i+"\tj="+j);
    i=i-k; j-=k;
    System.out.println("(3)\ti="+i+"\tj="+j);
    i=i*k; j*=k;
    System.out.println("(4)\ti="+i+"\tj="+j);
    i=i/k; j/=k;
    System.out.println("(5)\ti="+i+"\tj="+j);
    i=3; k=2; i*=k; i/=k;
    System.out.println("(6)\ti="+i);
    i=3; k=2; i/=k; i*=k;
    System.out.println("(7)\ti="+i);
    i=3; k=2; i%=k; i*=k;
    System.out.println("(8)\ti="+i);
  }
}
