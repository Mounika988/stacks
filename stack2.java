import java.util.*;
public  class stack2{
   public static class Node{
      int data;
      Node next;
      Node prev;
       public Node(int data){
         this.data=data;
         this.next=null;
         this.prev=null;
      }
   }
public static Node head;
public static Node tail;

  void push (int a){
   Node nn=new Node(a);
   if(head==null){
head=tail=nn;
   }
   else{
      Node temp=head;
      nn.next=temp;
      head=nn;
   }
    
  }
  void pop( ){
   if(head==null){
      System.out.println("there are no elementx in the list");
   }
   else{
     head=head.next;  
   }
  }
  int peek(){
    int top=head.data;
    return top;
  }
 public  boolean isempty(){
return head==null;
  }
  public static void main(String[] args){
     stack2 ll =new stack2();
ll.push(1);
ll.push(2);
ll.push(3);
ll.push(4);
//ll.display(head);
ll.pop();
ll.pop();
System.out.println(ll.peek());
while(!ll.isempty()){
   System.out.println(ll.peek());
   ll.pop();
}
}
   }