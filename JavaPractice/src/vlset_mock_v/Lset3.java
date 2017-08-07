package vlset_mock_v;
//Inner class

public class Lset3 {
	
	int a=10;
	
	Lset3(){
		System.out.print("foo");
	}
	
	class Bar{
		int a=19;
		
		Bar(){
			System.out.print("Bar");
			
		}
		
		public void go() {
			int a=99;
			System.out.print("go:"+a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lset3 l3 = new Lset3() ;
			
		l3.makeBar();

	}
	
	void makeBar() {
		(new Bar() {}).go();
		
	}

}
