
public class staticConstructorOrder {
	static int counter =0;
	public staticConstructorOrder() {
		// TODO Auto-generated constructor stub
	//inside constructore 
		System.out.println("inside static order constructor");
	}
	{
		System.out.println("Inside Blank block");
	}
	public static staticConstructorOrder staticOrder() {
		staticConstructorOrder st1;
		if (counter==0){
		  st1= new staticConstructorOrder() ;}
		System.out.println("inside static method");
		return st1;
	}
	public static void main (String args[]){
	staticConstructorOrder st1 = new staticConstructorOrder();
	staticConstructorOrder.staticOrder();
}
}
