package mccp;

import java.util.*;

import mccp.ll1.Node;

public class ll2 {
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
		ll2 l=new ll2();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.print(middle(head));
	}
	private static int middle(Node head) {
		if (head == null) {
		    System.out.println("List is empty");
		    return -1;
		}
		Node p=head;int l=0;
		while(p!=null)
		{
			l++;
			p=p.next;
		}
		Node p1 = head;
		for(int i=1;i<=l/2;i++)
		{
			p1=p1.next;
		}
		return p1.data;
	}


//	private static void display(Node head) {
//		// TODO Auto-generated method stub
//		Node temp=head;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
//		System.out.println();
//	}
}