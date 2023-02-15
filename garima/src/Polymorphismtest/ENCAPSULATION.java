package Polymorphismtest;

public class ENCAPSULATION {
	
	public static void main(String[] args) {
		shivi j=new shivi();
		j.setA(65);
		System.out.println(j.getA());
		
		
		j.setHi(" hey whats going on ");
		System.out.println(j.getHi()); 
	}
}

class shivi{
	private int a;
	private String hi;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getHi() {
		return hi;
	}
	public void setHi(String hi) {
		this.hi = hi;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	private int s;
	
	
	
	
	
}