package mccp;

import java.util.*;

public class ll9 {
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
		ll9 l=new ll9();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.print(palindrome(head,n));
	}
	private static boolean palindrome(Node head,int n) {
		// TODO Auto-generated method stub
		Node p1=head;
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<n;i++)
		{
			s.add(p1.data);
			p1=p1.next;
		}
		p1=head;
		while(p1!=null)
		{
			if(p1.data!=s.pop())
			{
				return false;
			}
			p1=p1.next;
		}
		return true;
	}
}