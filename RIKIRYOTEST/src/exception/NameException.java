package exception;

//사용자 정의 Exception
class NameException extends Exception{

	
	public NameException() {
		
		super("이름 초과");
	}
	
}
