package singleton;

public class Singleton {

	private static Singleton INSTANCE;
	
	int a;
	String b;
	
	
	
	public static Singleton getInstance() {
		
		if(INSTANCE == null) {
			System.out.println("���ο� ��ü�� ����ϴ�!");
			INSTANCE = new Singleton();
		}else {
			System.out.println("��ü�� �̹� �����մϴ�!");
		}
		
		
		return INSTANCE;
	}
}
