package mccp;

import java.util.*;

public class ll13 {
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
		ll13 l=new ll13();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		System.out.print(detect(head,n));
	}
	private static boolean detect(Node head,int n) {
		// TODO Auto-generated method stub
		Node p1=head;
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(!h.contains(p1.data))
			{
				h.add(p1.data);
				p1=p1.next;
			}
			else
			{
				return true;
			}
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
	}
}