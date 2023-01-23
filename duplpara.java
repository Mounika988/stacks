import java.util.*;
public  class duplpara{
  public static String check(Stack<Character>s,String name){
   int i;
   int c=0;
   for(i=0;i<name.length();i++){
      c=0;
      if(name.charAt(i)==')'){
         while(s.peek()!='('){
            s.pop();
            c++;
         }
         s.pop();
         if(c<1){
            return "dup exists";
         }
      }
      else{
s.push(name.charAt(i));
      }   
  }
  return "dup not exists";  
}

  public static void main(String[] args){
    Stack<Character>s=new Stack<>();
     String name ="((a+b)+(c+d))";
   System.out.println(check(s,name));
}
}