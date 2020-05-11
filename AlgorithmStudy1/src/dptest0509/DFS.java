package dptest0509;

import java.util.Stack;

public class DFS {
	//Stack
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		//부모 노드를 빼고 출력
		//자식 노드가 없으면 출력
		//자식 노드를 Stack push
		//이미 출력한 노드는 continue
		//stack.length == 0 이면 break;
		
		stack.push(0);
		
	}
	
	public int dfsR(int x) {
		
		return dfsR(x+1);
	}
}
