import java.util.*;
public  class pallin{
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
  public static boolean pal(pallin ll){
   Node temp=tail;
   while(temp!=null){
      if(ll.peek()!=temp.data)
      {
return false;
      }
      else{
         ll.pop();
        temp=temp.next;
      }
   }
   return true;

  }

  public static void main(String[] args){
     pallin ll =new pallin();
ll.push(1);
ll.push(0);
ll.push(0);
ll.push(1);
System.out.println(pal(ll));

}
}