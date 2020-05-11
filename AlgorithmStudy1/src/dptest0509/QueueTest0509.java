package dptest0509;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

/*class Queue<T>{
	
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
		dfs();
	}
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
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
		bfs();
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
	
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	
	void dfsR() {
		dfsR(0);
	}
	
	void visit(Node n) {
		System.out.println(n.data + " : ");
	}
}*/


public class QueueTest0509 {

	//Queue : ���Լ��� FIFO
	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
	}
}