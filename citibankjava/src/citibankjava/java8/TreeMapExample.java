package citibankjava.java8;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int htno;
	String name;
	String branch;
	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int htno, String name, String branch) {
		super();
		this.htno = htno;
		this.name = name;
		this.branch = branch;
	}
	public Student() {
		
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.branch.compareTo(o.branch);
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", branch=" + branch + "]";
	}
	
}

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tm = new TreeSet();
		tm.add("sunil");
		tm.add("anil");
		tm.add("mahesh");
		tm.add("kamal");
		System.out.println(tm);
		
		TreeSet<Student> ts = new TreeSet();
		ts.add(new Student(1001,"praven","cse"));
		ts.add(new Student(1002,"kumar","eee"));
		ts.add(new Student(1003,"satish","biotech"));
		System.out.println(ts);
		
		
	}

}
