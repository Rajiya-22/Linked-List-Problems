package mccp;

import java.util.*;

public class ll6 {
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
		ll6 l=new ll6();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.println("enter nth");
		int x=sc.nextInt();
		nth(head,x);
	}
	private static void nth(Node head,int n) {
		// TODO Auto-generated method stub
		Node p1=head;
		display(head);int c=0;
		for(int i=0;i<n-1;i++)
		{
			p1=p1.next;
			c++;
		}
		Node t=p1;
		System.out.print(t.data);		
		p1=p1.next;
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