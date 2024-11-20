interface A
		{
	         //int num=6;//by default variable public,static and Final
			 void show();  //interface only accepted method Declaration 
		                   //by default ,it is public and abstract method
		}
interface x
{
	void abc();
	
	
}
class b implements A,x
{
	public void show()
	{
	System.out.println("in show");
	
	}
	public void abc()
	{
		System.out.println("in abc");
	}
}
public class Interface {

	public static void main(String[] args) {
	b obj=new b();
	obj.show();
	obj.abc();
	
   
	}

}
