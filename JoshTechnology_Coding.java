import java.util.*;

public class JoshTechnology_Coding {
    static Node head;
     static Node tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        JoshTechnology_Coding ll=new JoshTechnology_Coding();
        ll.insert(1);
                ll.insert(2);
                ll.insert(3);
                ll.insert(4);
                ll.insert(5);
                ll.insert(6);
                ll.insert(7);
                ll.insert(7);
                ll.insert(8);
                ll.insert(7);
                ll.insert(7);
                                ll.insert(7);
                                                ll.insert(7);
                ll.insert(7);

               



                int m=sc.nextInt();
                int n=sc.nextInt();
Node tr=pl(head,m,n);
while(tr!=null){
    System.out.print(tr.data+" ");
    tr=tr.next;
}
    }

    public static void insert(int data){
Node newnode=new Node(data);
if(head==null){head=newnode;tail=newnode;}
else {
    tail.next=newnode;
    tail=tail.next;
}
    }

   public static Node pl(Node head,int m,int n) {
    Node newNode = new Node(0); // or with parameters: new Node(data)
    Node dummy=newNode;
while(head!=null){
    int i=0;
    while(head!=null&&i<m){
        newNode.next=head;
        head=head.next;
        newNode=newNode.next;
        i++;
    }
    
    int j=0;
    Node track=head;
    while(head!=null&&j<n){
        head=head.next;
        j++;
    }
    if(head==null&&j<n-1)newNode.next=track;
    else {newNode.next=new Node(-1);newNode=newNode.next;}
}
    return dummy.next;
}

}
