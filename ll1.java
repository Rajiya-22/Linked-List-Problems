package mccp;

import java.util.*;

public class ll1 {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static Node head=null;
	private Node insert(int ele,Node head) {
		// TODO Auto-generated method stub
		Node temp=new Node(ele);
		Node p=head;
		if(head==null)
			head=temp;
		else {
		while(p.next!=null) {
			p=p.next;
		}
		p.next=temp;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ll1 l=new ll1();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.println("over");
		pairWiseSwap(head);
	}
	private static void pairWiseSwap(Node head) {
		// TODO Auto-generated method stub
		
		if(head==null)
		{
			System.out.print("null");
			return;
		}
		Node p1=head;
		while(p1!=null && p1.next!=null ) {
			int t=p1.data;
			p1.data=p1.next.data;
//			System.out.println(p1.data+" "+p1.next.data);
			p1.next.data=t;
			p1=p1.next.next;
		}
		display(head);
	}
	
	private static void display(Node head) {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}