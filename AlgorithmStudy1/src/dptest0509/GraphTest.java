package dptest0509;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

class Queue<T>{
	
	//������ Node�� ��Ÿ���� ���� class
	class Node<T>{
		//���� Node�� ��Ÿ���� ����
		private T data;
		//���� Node ������ ��Ÿ���� ����
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	//�� �� ���
	private Node<T> first;
	//�� ������ ���
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		//�������� �������������, 
		//���� �Է¹���  T�� �������� next�� ����
		if(last != null) {
			last.next = t;
		}
		//�� ���� last�� ���� �Է¹��� T�� ��
		last = t;
		
		//���� add�ϴ� ��� first�� last�� ��� �����ϰ�
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
		//������ Node�� ��� ����
		//LinkedList�� stack�� �������� ����ȴ�
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
		
		//���̿켱�˻�(Stack)
		//DFS : �ϳ��� �ڽĳ�带 �湮������ �� �ڽ��� �ڽĳ�带 ���� �湮
		//�� ������ �ڽĳ���� ������忡 �湮
		
		//���̿켱�˻�(Queue)
		//BFS : ����������
		//�ڽĳ�� ���� �湮

//		g.dfs();
//		g.bfs();
//		g.dfsR();
		g.dfs(3);
//		g.dfsR(3);
		
	}
}