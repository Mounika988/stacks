import java.util.*;
public  class stack1{

  void push (int a, ArrayList<Integer>list1){
    list1.add(a);
  }
  void pop( ArrayList<Integer>list1){
    list1.remove(list1.size()-1);
  }
  int peek( ArrayList<Integer>list1){
    int top=list1.get(list1.size()-1);
    return top;
  }
  public boolean isempty(ArrayList<Integer>list1){
    return list1.size()==0;
  }
  public static void main(String[] args){
     stack1 s=new stack1();
     ArrayList<Integer>list1 =new ArrayList<>();
     int i=0;
s.push(1,list1);
s.push(2,list1);
s.push(3,list1);
s.push(4,list1);
s.pop(list1);
s.pop(list1);
System.out.println(s.peek(list1));
while(!s.isempty(list1)){
System.out.println(s.peek(list1));
s.pop(list1);
}
   }

}