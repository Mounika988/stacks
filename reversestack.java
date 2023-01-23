import java.util.*;
public  class reversestack{
   public static void pushatbottom(Stack<Integer>s,int a){
      if(s.empty()){
         s.push(a);
         return;
      }
      
         int top=s.pop();
         pushatbottom(s,a);
         s.push(top);
      
     
     }
  public static void rev(Stack<Integer>s){
   if(s.empty()){
      return;
   }
   else{
      int temp=s.pop();
      rev(s);
      pushatbottom(s,temp);
   }
  
  }
  public static void display(Stack<Integer>s){
   while(!s.empty()){
      System.out.println(s.peek());
      s.pop();
   }
  }

  public static void main(String[] args){
    Stack<Integer>s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
   // System.out.println(s);
  // display(s);
   rev(s);
   System.out.println("after");
   display(s);
  
}
}