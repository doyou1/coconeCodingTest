package vo;

public class B extends A{

	int b;
	int c;
	
			//10, 12
	public B(int A, int B) {
		super();//Super Class의 생성자 호출
		//A.a : 0, A.b : 0
		//기본 생성자 호출, 초기화가 된 상태로 만듬, int는 0
		//this.b : B.b 
		//b		: A.b
		//a : 10
		
		System.out.println(super.a);// 0
		System.out.println(this.a);
		b = A + B;//b : 10 + 12// b : 22
		//this.b = A + B;//b : 10 + 12// b : 22
		
		c = a + super.b + 10;//c : 0 + 0 + 10
//		this.c = super.a + super.b + 10;//c : 0 + 0 + 10
	}
}
