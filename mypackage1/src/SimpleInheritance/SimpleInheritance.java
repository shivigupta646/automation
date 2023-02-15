package SimpleInheritance;

public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SubClass obj = new SubClass();
      
      obj.shivi();
      obj.shivi3();
      obj.shivi1();
      obj.shivani4();
      obj.shivani3();
      obj.shivani2();
      obj.shivani();
      
      SuperClass obj1 = new SubClass();
      obj1.shivani2();
//when we make objeect of child class and hold on parent class then method shows run only parent class
	}

}
