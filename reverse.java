import java.util.*;
public  class reverse{
  public static String rev(Stack<Character>s){
   StringBuilder result=new StringBuilder("");
   while(!s.empty()){
      result.append(s.pop());
   }
   return result.toString();
  }

  public static void main(String[] args){
    Stack<Character>s=new Stack<>();
     String name ="mona";
     int i=0;
     while(i<name.length()){
        s.push(name.charAt(i));
        i++;
     }
   System.out.println(rev(s));
}
}