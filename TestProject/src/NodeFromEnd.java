/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
class LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	public void printNthNodefromEnd(int n) {
		int len = lengthOfLinkedList(head);
		if(len<n)
			return;
		
		Node temp = head;
		for(int i=0;i<len-n+1;i++)
			temp=temp.next;
		
		System.out.println(n+"th Node from last :: "+temp.data);
		
	}
	
	int lengthOfLinkedList(Node node) {
		int len = 0;
		while(node!=null) {
			len++;
			node = node.next; 
		}
		return len;
	}
}
public class NodeFromEnd {


	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(60);
		list.push(70);
		list.push(20);
		list.push(40);
		list.push(10);
		list.push(50);
		
		list.printNthNodefromEnd(4);
		list.printNthNodefromEnd(3);
		list.printNthNodefromEnd(2);

	}

}
