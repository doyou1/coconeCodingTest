package dptest0509;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

class Queue<T>{
	
	//각각의 Node를 나타내는 내부 class
	class Node<T>{
		//현재 Node를 나타내는 변수
		private T data;
		//현재 Node 다음을 나타내는 변수
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	//맨 앞 노드
	private Node<T> first;
	//맨 마지막 노드
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		//마지막이 비어있지않으면, 
		//지금 입력받은  T를 마지막의 next로 지정
		if(last != null) {
			last.next = t;
		}
		//그 이후 last는 지금 입력받은 T가 됨
		last = t;
		
		//최초 add하는 경우 first와 last를 모두 동일하게
		if(first == null) {
			first = last;
		}
		
	}
	
	public T remove() {
		
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		
		if(first == null) {
			last = null;
		}
		
		return data;
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}

class Graph{
	class Node{
		int data;
		//인접한 Node를 담는 변수
		//LinkedList는 stack의 개념으로 저장된다
		LinkedList<Node> adjacent;
		boolean marked;
		Node(int data){
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	Node[] nodes;
	
	Graph(int size){
		nodes = new Node[size];
		for(int i = 0; i<size; i++) {
			nodes[i] = new Node(i);
		}
	}
	
	void addEdge(int i1, int i2) {
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}
	
	void dfs() {
		dfs(0);
	}
	
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		root.marked = true;
		while(!stack.isEmpty()) {
			Node r = stack.pop();
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					stack.push(n);
				}
			}
			visit(r);
		}
	}
	
	void bfs() {
		bfs(0);
	}
	
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
		queue.add(root);
		root.marked = true;
		while(!queue.isEmpty()) {
			Node r = queue.remove();
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					queue.add(n);
				}
			}
			visit(r);
		}
	}
	
	void dfsR() {
		dfsR(0);
	}
	
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	
	void dfsR(Node r) {
		if(r == null) return;
		r.marked = true;
		visit(r);
		for(Node n : r.adjacent) {
			if(n.marked == false) {
				dfsR(n);
			}
		}
	}	
	
	void visit(Node n) {
		System.out.print(n.data + " ");
	}
}

/*
 	0
   /
 1 -- 3    7
 |  / | \ /
 | /  |	 5
 2 -- 4   \
 		   6 - 8
 *
 *
 */
	
public class GraphTest {

	public static void main(String[] args) {
		Graph g = new Graph(9);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(5,6);
		g.addEdge(5,7);
		g.addEdge(6,8);
		
		//깊이우선검색(Stack)
		//DFS : 하나의 자식노드를 방문했으면 그 자식의 자식노드를 전부 방문
		//그 다음에 자식노드의 형제노드에 방문
		
		//넓이우선검색(Queue)
		//BFS : 레벨단위로
		//자식노드 전부 방문

//		g.dfs();
//		g.bfs();
//		g.dfsR();
		g.dfs(3);
//		g.dfsR(3);
		
	}
}
