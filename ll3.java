package mccp;

import java.util.*;

public class ll3 {
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
		ll3 l=new ll3();
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
		Node p1=head;
		System.out.print("null");
		if(p1==null)
		{
			System.out.print("null");
		}
		while(p1.next!=null) {
			int t=p1.data;
			p1.data=p1.next.data;
//			System.out.println(p1.data+" "+p1.next.data);
			p1.next.data=t;
			p1=p1.next.next;
		}
		p1=head;
		display(p1);
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