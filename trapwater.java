import java.util.*;
public  class trapwater{
   public static int trap(int list1[])
   {
      int i;
      int tw=0;
      Stack<Integer>s=new Stack<>();
      for(i=0;i<list1.length;i++){
         while(!s.empty()&&list1[s.peek()]<=list1[i]){
            int rm=i;
            int curr=list1[s.pop()];
            if(s.empty()){
               break;
            }
            int lm=s.peek();
            int width=rm-lm-1;
            tw=tw+(Math.min(list1[rm],list1[lm])-curr)*width;
            System.out.println("tw is"+tw);
         }
s.push(i);
      }
      return tw;
   }
  public static void main(String[] args){
 int list1[]={7,0,4,2,5,0,6,4,0,5};     
   System.out.println(trap(list1));
} 
}