package mccp;

import java.util.*;

import mccp.ll13.Node;

public class ll14 {
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
		ll14 l=new ll14();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.print(detect_floyd(head,n));
	}
	private static boolean detect_floyd(Node head,int n) {
		// TODO Auto-generated method stub
		Node p1=head;
		Node p2=head.next;
		while(p1!=null && p2!=null && p2.next!=null)
		{
			if(p1==p2)
			{
				return true;
			}
			if(p1==p1.next.next)
			{
				return true;
			}
			p1=p1.next;
			p2=p2.next.next;
		}
		return false;
	}
	private static void display(Node head) {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		final int i;
		i = 2;
		i = 30;
		System.out.println(i);
	}
}