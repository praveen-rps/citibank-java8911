package citibankjava.java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> f1 = radius -> 3*radius*radius;
		Function<Integer,Integer> fact= x->{
			
				int f=1;
				for(int i=2;i<=x;i++)
					f=f*i;
				return f;
		};
		System.out.println("The area of circle with 3 radius is : "+f1.apply(3));
		System.out.println("The factorial of 4 is :"+fact.apply(4));
		System.out.println("The factorial of 6 is :"+fact.apply(6));
		
		System.out.println(f1.andThen(fact).apply(2));
		System.out.println(f1.compose(fact).apply(2));
	}

}
