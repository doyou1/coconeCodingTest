package study0415;

//Object����Ŭ������ toString
public class test1 {

	String a;
	String b;
	String c;
	String d;
	String e;
	
	/*�����ε�*/
	public test1() {
		a = "����� �ٺ�";
	}
	public test1(String a, String b, String c) {
		this.a = "����� ����";
		this.b = "����� õ��";
		this.c = "����� �̻�";
	}
	public test1(int num) {
		this.e = num + "";
	}
	
	public test1(String a) {
		System.out.println("����");
		
	}
	
	/*�������̵�*/
	//���� Ŭ�������� ������ ���� ���̱� ������ �Ķ���Ϳ� ���ϰ�, �̸��� �޶� �� �� ����
	@Override
	public String toString() {
		return "����� ����";
	}
	
}
