package citibankjava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside the thread...");
	}
}
*/
class Employee{
	double salary;
	Employee(int basic){
		salary=basic + basic*0.55;
	}
	
	
	
}


@FunctionalInterface
interface Mathematics{
	public int add(int a, int b);

}

@FunctionalInterface
interface EmployeeCals{
	public Employee calSalary(Employee emp);
}



public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyThread t = new MyThread();
		//Thread t1 = new Thread(t);
		//t1.start();
		
		Runnable r = ()->	System.out.println("Inside the child thread -new");
		Thread t2 = new Thread(r);
		t2.start();
		
		EmployeeCals ec = emp->emp;
		Employee e1 = new Employee(1000);
		Employee e2 = ec.calSalary(e1);
		System.out.println(e2.salary);
		
		
		Mathematics  m = (a,b)->a+b;
		
		System.out.println("The sum of 10 and 20 is : "+m.add(10,20));
		System.out.println("The sum of 101 and 201 is : "+m.add(101,201));
		System.out.println("The sum of 100 and 200 is : "+m.add(100,200));
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("sunil");
		names.add("anil");
		names.add("mahesh");
		names.add("kamal");
		System.out.println(names);
		Collections.sort(names);
		System.out.println("After sorting..");
		System.out.println(names);
		
		Comparator<String> c = (s1,s2)-> -( s1).compareTo(s2);
		/*
		 * class NameComparator implements Comparator<String,String>{
		 * 
		 * 		public boolean compareTo(String s1, String s2){
		 * 			return s1.comapareTo(s2);
		 * 		}
		 * }
		 * 
		 * NameComparator n = new NameComparator();
		 * 
		 * 
		 * 
		 */
		
		Collections.sort(names,(s1,s2)-> -( s1).compareTo(s2));
		System.out.println("names in descending order...");
		System.out.println(names);
		

	}

}
