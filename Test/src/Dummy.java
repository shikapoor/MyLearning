import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Dummy {

	public static void main(String args[] ) {
		Integer v1= new Integer(25);
		Integer v2 = new Integer(25);
		System.out.println(v1==v2);
		System.out.println(v1.equals(v2));
		
		HackerEarth obj1 = new HackerEarth();
		Hacker obj2 = new Hacker();
		
		((HackerEarth)obj2).print();
		
		obj1 = obj2;
		
		obj1.print();
		
		HackMeEarth.obj.work();
		
		List<Long> list = Arrays.asList(-9l, -18l, 0l, 25l, 4l); 
		  
        System.out.print("The maximum value is : "); 
  
        // Using stream.max() to get maximum 
        // element according to provided Comparator 
        // and storing in variable var 
        Long var = list.stream().max(Long::compare).get(); 
  
//        System.out.print(var);
        long[] arr = {567342,1,2,3,4,444444};
        
        long var1 = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().max(Long::compare).get(); 
        System.out.println(var1);
       
       
        
	}
}

class HackerEarth
{
	public void print()
	{
		System.out.println("HackerEarth");
	}
}

class Hacker extends HackerEarth 
{
	public void print()
	{
		System.out.println("Hacker");
	}
}

interface HackMeEarth
{
	public void work();
	
	class NoWork implements HackMeEarth
	{
		private NoWork()
		{
			System.out.println("Constructor");
		}

		@Override
		public void work() {
			System.out.println("Hoi");
			
		}
		
	}
	
	HackMeEarth obj = new NoWork();
	
}


