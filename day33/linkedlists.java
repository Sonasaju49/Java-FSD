package day33;

public class linkedlists {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int t)
		{
			data=t;
			next=null;
		}
	}
	public void display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" \n");
			n=n.next;
		}
	}

	public static void main(String[] args) {
		linkedlists list =new linkedlists();
		list.head=new Node(100);
		Node second =new Node(200);
		Node third=new Node(300);
		list.head.next=second;
		list.display();
	}

		
		// TODO Auto-generated method stub

	}


