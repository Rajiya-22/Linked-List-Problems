package mccp;

import java.util.*;

public class ll5 {
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
		ll5 l=new ll5();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.println("enter nth");
		int x=sc.nextInt();
		System.out.print(nth(head,x,n));
	}
	private static int nth(Node head,int n,int l) {
		// TODO Auto-generated method stub
		Node p1=head;
		for(int i=0;i<l-n;i++)
		{
			p1=p1.next;
		}
		return p1.data;
	}
}