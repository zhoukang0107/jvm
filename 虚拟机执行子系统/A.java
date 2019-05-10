

public class A{
	private int a = 1;
	private int b = 2;
	private static String str = "a class";
	
	int add(int m, int n){
		int d = a + m + n;
		return d;
	}
	
	int sub(int m, int n){
		int d = a - m - n;
		return d;
	}
	
	public static void main(String[] args){
		A a = new A();
		int res = a.add(4,5);
		res = res - a.sub(0,2);
	}
}