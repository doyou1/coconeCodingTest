package study0415;

public class MainForTest {

	
	public static void main(String[] args) {
		
		test1 t1 = new test1();
		
		//System.out.println(t1.a);//∞ÊπŒ¿Ã πŸ∫∏
		
		String a = "1";
		String b = "2";
		String c = "3";
		
		test1 t2 = new test1(a,b,c);
		
		System.out.println(t2.a);
		
		test1 t3 = new test1("asd");
		
	}
}
