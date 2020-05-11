package singleton;

public class Singleton {

	private static Singleton INSTANCE;
	
	int a;
	String b;
	
	
	
	public static Singleton getInstance() {
		
		if(INSTANCE == null) {
			System.out.println("새로운 객체를 만듭니다!");
			INSTANCE = new Singleton();
		}else {
			System.out.println("객체가 이미 존재합니다!");
		}
		
		
		return INSTANCE;
	}
}
