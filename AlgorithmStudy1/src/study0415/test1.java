package study0415;

//Object상위클래스에 toString
public class test1 {

	String a;
	String b;
	String c;
	String d;
	String e;
	
	/*오버로딩*/
	public test1() {
		a = "경면이 바보";
	}
	public test1(String a, String b, String c) {
		this.a = "경민이 재형";
		this.b = "경민이 천재";
		this.c = "경민이 이쁨";
	}
	public test1(int num) {
		this.e = num + "";
	}
	
	public test1(String a) {
		System.out.println("만듬");
		
	}
	
	/*오버라이딩*/
	//상위 클래스에서 가져와 쓰는 것이기 때문에 파라미터와 리턴값, 이름이 달라 질 수 없다
	@Override
	public String toString() {
		return "경민이 좋아";
	}
	
}
