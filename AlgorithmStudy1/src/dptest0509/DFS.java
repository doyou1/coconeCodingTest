package dptest0509;

import java.util.Stack;

public class DFS {
	//Stack
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		//�θ� ��带 ���� ���
		//�ڽ� ��尡 ������ ���
		//�ڽ� ��带 Stack push
		//�̹� ����� ���� continue
		//stack.length == 0 �̸� break;
		
		stack.push(0);
		
	}
	
	public int dfsR(int x) {
		
		return dfsR(x+1);
	}
}
