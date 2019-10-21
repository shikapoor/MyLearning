
public class StaticClassConcept {

	public static void main(String args[])
	{
		B.add();
	}
}

class A
{
	public static void add()
	{
		System.out.println("A");
	}
}
class B extends A
{
	public static void substract()
	{
		add();
	}
}