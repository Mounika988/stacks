import java.util.*;
public  class simpath{
  public static String check(Stack<Character>s,String name){
    Stack<String>st=new Stack<String>();
    String res="";
    res+="/";
   int i;
   String result="";
   int l=name.length();
   for(i=0;i<name.length();i++){
    String dir="";
    System.out.println(i);
    while(i<l && name.charAt(i)=='/'){
      i++;
    }
    while(i<l && name.charAt(i)!='/'){
      dir=dir+name.charAt(i);
      i++;
    }
    System.out.println("dir1is  "+dir);
    if(dir.equals("..")==true){
      if(!st.empty()){
        st.pop();
      }
    }
    else if(dir.equals(".")==true){
      continue;
    }
    else if(dir.length()!=0){
      st.push(dir);
    }
  }
  Stack<String>st1=new Stack<String>();
  while(!st.empty()){
    st1.push(st.pop());
  }
  System.out.println("size is"+st1.size());
  while(!st1.empty()){
    if(st1.size()!=1){
      //System.out.println("res is"+res);
     // System.out.println("string is"+st1.pop());
      res=res+(st1.pop()+"/");
      System.out.println("res is"+res);
    }
    else{
      res+=st1.pop();
      System.out.println("res is"+res);
    }
  }
  return res;
}

  public static void main(String[] args){
    Stack<Character>s=new Stack<>();
     String name ="/home//foo/";
     //"/a/../.././../../."

   System.out.println(check(s,name));
}
}