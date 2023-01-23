import java.util.*;
public  class nxtgrtrl{
   public static int[] span(int list1[])
   {
      Stack<Integer>s=new Stack<>();
      int list2[]=new int[list1.length]; 
      int i;
     for(i=0;i<list1.length;i++){
      while(!s.empty()&&list1[s.peek()]<list1[i]){
         s.pop();
      }
      if(s.empty()){
          list2[i]=-1;
      }
      else{
         list2[i]=list1[s.peek()];
      }
      s.push(i);
     }
     return list2;
   }
  public static void main(String[] args){
 int list1[]={6,8,0,1,3};
 int list2[]=new int[list1.length];     
int i=0;
list2=span(list1);
for(i=0;i<list2.length;i++){
   System.out.println(list2[i]);
} 
}
}