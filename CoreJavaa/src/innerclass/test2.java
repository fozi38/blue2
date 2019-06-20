package innerclass;

public class test2 {
	int x=10;
	
	test2(){
		System.out.println("test2 constructor");
	}
	
	void fun(){
		class local{
			local(){
				super();
				System.out.println("Inner Constructor");
				
			}
			void seeouter(){
				System.out.println("Outer x ="+x);
			}
		}
		local l=new local();
		l.seeouter();
	}
	
	public static void main(String args[]){
		test2 t=new test2();
		t.fun();
	}

}
