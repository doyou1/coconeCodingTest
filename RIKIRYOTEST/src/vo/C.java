package vo;

public class C extends B{

	int b;
	int c;
	
	//16,8
	public C(int A, int B) {
		super(B, A);//8,16
		System.out.println("super.b : " + super.b);
		System.out.println("super.a : " + super.a);
		this.b = super.b + B;
		
		System.out.println("this.b : " + this.b);
		
	}

}
