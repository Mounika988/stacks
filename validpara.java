import java.util.*;
public  class validpara{
  public static boolean check(Stack<Character>s,String name){
   int i;
   for(i=0;i<name.length();i++){
      if(name.charAt(i)=='{'|| name.charAt(i)=='[' || name.charAt(i)=='(')
      {
      s.push(name.charAt(i));
      }
      else{
         if(s.empty())
         {
            return false;
         }
         else{
            if(s.peek()=='{'&&name.charAt(i)=='}' ||s.peek()=='['&&name.charAt(i)==']'||s.peek()=='('&&name.charAt(i)==')'){
   s.pop();
            }
            else{
               return false;
            }
         }
      }
   }
   if(s.empty()){
      return true;
   }
   else{
      return false;
   }
  }

  public static void main(String[] args){
    Stack<Character>s=new Stack<>();
     String name ="{[()]}";
   System.out.println(check(s,name));
}
}