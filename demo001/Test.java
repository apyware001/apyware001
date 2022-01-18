package demo001;

import java.util.jar.Attributes.Name;

public class Test {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("z");
		u1.setHeight(165);
		u1.setSalary(20000);
		u1.setIntroduce("nmsl");
		
		System.out.println(u1.getName());		
		System.out.println(u1.getHeight());		
		System.out.println(u1.getSalary());		
		System.out.println(u1.getIntroduce());		
		
		User u2 = new User(name:"zz",height:180,salary:10,inroduce:"nmsl");
		System.out.println(u2.getName());		
		System.out.println(u2.getHeight());		
		System.out.println(u2.getSalary());		
		System.out.println(u2.getIntroduce());		
		
	}
	
}
