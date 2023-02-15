package project2;

public class Vairiable {
	static int i=10;
    int b=20;
    
    	
    
    public static void main(String[] args) {
    	
		System.out.println(i);
		Vairiable a=new Vairiable();    ////block
		System.out.println(a.b);
		a.shivam();
		short Y=10;
		Y=20;
		Y=30;
		Y=60;
		System.out.println(Y);
	
		
	}
    public void shivam() {
    
		Vairiable a=new Vairiable();    ////block
		a.b=30;
		System.out.println(a.b);
		Vairiable c=new Vairiable();    ////block
		c.b=40;
         System.out.println(c.b);

    }
    static {
    
   
   System.out.println("hii");
    System.out.println(i);
		Vairiable  ad=new Vairiable();    ////block
		ad.b=50;
        System.out.println(ad.b);

    }
    
    
    }
    
    
    
    



