import java.util.*;
public  class decode{
  public static String  che(String name){
    Stack<String>wo=new Stack<String>();
    Stack<Integer>in=new Stack<Integer>();
   StringBuilder res=new StringBuilder();
   int i=0;
   int j=0;
   int l=name.length();
   int num=0;
   for(i=0;i<l;i++){
      char ch=name.charAt(i);
   if(Character.isDigit(ch)){
      num=(num*10)+(ch-'0');  
   }
   else if(Character.isLetter(ch)){
      res.append(ch);
   }
   else if(ch=='[')
   {
      in.push(num);
      String s=res.toString();
      wo.push(s);
      num=0;
      res=new StringBuilder();
   }
   else{
int count=in.pop();
StringBuilder pre=new StringBuilder(wo.pop());
for(j=0;j<count;j++){
   pre.append(res);
}
res=pre;
count=0;
}
}
  return res.toString();
}

  public static void main(String[] args){
     String name ="2[cv]";
     //"/a/../.././../../."
   System.out.println(che(name));
}
}