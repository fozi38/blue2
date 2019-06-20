package innerclass;

public class test1 {
	int x = 100;

	private class inner1 {
		private int x = 10;
	}

	class inner2 {
		inner2() {
			System.out.println(new inner1().x);
		}
	}

	public static void main(String[] args) {
		test1 t = new test1();
		System.out.println(t.new inner1().x);;
		
	}

}
