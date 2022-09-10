package mypackage;

public class Calculate {

	public int sum(int x) {
		return x+100;
	}
	public int sum(int x,int y) {
		return x+y;
	}
	public int sum(int x,int y,int z) {
		return x+y+z;
	}
	public double sum(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c=new Calculate();
		System.out.println(c.sum(20));
		System.out.println(c.sum(22.4,55.6));
		System.out.println(c.sum(10,20));
		System.out.println(c.sum(10,20,30));
		
	}

}
