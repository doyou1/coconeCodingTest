package study0415;

public class Solution1 {
/*�����̴� ����� �ö󰡰� �ִ�. �����̴� ����� 
 * �ִ� 2ĭ ���� �� �ִٰ� �� �� ����� ������ ����� �������� ����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.

n�� 3�� ��츦 ���ε��

1. 1 - 2 - 3

2. 1 - 3

3. 2 - 3

�̷��� 3 ���� ����� �����ϴ�. (�����̴� 0���� ��� ������ ���� �����Ѵ�.)

�Է�
n �� 30 ������ ���� �����̴�.

���
���� �� �ִ� ���� ���� ����Ѵ�*/
	
	static int classN = 10;
	static int classCount = 0;
	
	public static void main(String[] args) {
		int n = 10;//����� 10��
		classN = n;
		Solution1 s1 = new Solution1();
		s1.solution();
	}
	
	public void solution() {
		
		callback(1);
		//�� �Լ��� ��� �ҷ������� classCount
		System.out.println(classCount);
	}
	
	public void callback(int temp) {
		
		if(temp >= classN) {
			classCount += 1;
		}else{
			//��ĭ ���� ���
			callback(temp+1);
			//��ĭ ���� ���
			callback(temp+2);
		}
		
	}
}
