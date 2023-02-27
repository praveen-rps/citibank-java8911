package citibankjava.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

class User{
	String uname;
	String passwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public User(String uname, String passwd) {
		super();
		this.uname = uname;
		this.passwd = passwd;
	}
	public User() {
		
	}
}
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> p6 = (n1,n2)-> n1 >n2;
		Predicate<Integer> p1 = n->n%2==0;
		Predicate<Integer> p2 = n->n>20;
		Predicate<User> p4  = 
				user -> user.getPasswd().equals("admin") && user.getUname().equals("admin");
		
		Predicate<Student> p3 = s -> s.getBranch().equals("cse");
		Student s1 = new Student(1001,"Praven","cse");
		Student s2 = new Student(1002,"kumar","eee");
		// and , or , not
		System.out.println("is student s1 branch cse:"+p3.test(s1));
		System.out.println("is student s2 branch cse:"+p3.test(s2));
	
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));
		System.out.println(p2.test(221));
		System.out.println(p2.test(11));
		
		System.out.println(p1.or(p2).test(11));
		System.out.println(p1.negate().test(10));
		
		User user1 = new User("admin","admin");
		User user2 = new User("Praveen","Kumar");
		if(p4.test(user2))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
		
		System.out.println(p6.test(180, 20));

	}

}
