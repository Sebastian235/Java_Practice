package java;
import java.io.IOException;
import java.time.LocalTime;
import java.util.List;
public class Sample1 {
	public float m(long a){
		return a;
	}
	
	
	
	public static void main(String... args){
		String name = "JAVA";
		String name2 = "JAVA";
		String name3 = new String("java");
		if(name==name2){
			System.out.println("Eq");
		}
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(new Sample1().m(5683729347298743947l));
		//char c ='a';
		for(char c ='a';c<='z';c++){
			System.out.println(c);
		}
		throw new ClassCastException(); 
		 
	}

}
