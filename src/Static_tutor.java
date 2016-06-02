
public class Static_tutor {
	public class Constructors {
		Constructors(){
			System.out.println("inside constructors");
		}
		
	
	}
	class extender extends Constructors{
		extender(){
			System.out.println("inside extender");
		}
		extender(int a){
			System.out.println("inside extender int waala");
		}
		public static void theExtender(){
		extender e = new extender();}
	}
	public static void main(String [] args){
		Constructors c = new Constructors();
	}
}
