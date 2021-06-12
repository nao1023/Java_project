package LogisticEq;

public class LogisticBifurcation {
	public static void main(String[] args) {
		double x1[]=new double[1000];

		for(double r=2.8;r<=4.00;r+=0.01){
			// System.out.println(r);
			double x=0.5;
			for(int n=0;n<500;n++) {
				x=r*(1-x)*x;
			}
			x1[0]=x;
			// System.out.println(x1[0]);
			for(int k=1;k<1000;k++){
				x1[k]=r*(1-x1[k-1])*x1[k-1];
				System.out.println(r+"\t"+x1[k]);
			}
		}
	}
}
