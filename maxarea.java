import java.util.*;
public  class maxarea{
   public static int maxa(int list1[])
   {
      Stack<Integer>s=new Stack<>();
      int max=-1;
      int list2[]=new int[list1.length]; 
      int list3[]=new int[list1.length]; 
      int i;
     for(i=list1.length-1;i>=0;i--){
      while(!s.empty()&&list1[s.peek()]>=list1[i]){
         s.pop();
      }
      if(s.empty()){
          list2[i]=list1.length;
      }
      else{
         list2[i]=s.peek();
      }
      s.push(i);
     }
     s=new Stack<>();
     for(i=0;i<list1.length;i++){
      while(!s.empty()&&list1[s.peek()]>list1[i]){
         s.pop();
      }
      if(s.empty()){
          list3[i]=-1;
      }
      else{
         list3[i]=s.peek();
      }
      s.push(i);
     }
     for(i=0;i<list1.length;i++){
      int h=list1[i];
      int w=list2[i]-list3[i]-1;
      int area=h*w;
      max=Math.max(area,max);
     }
     return max;
     
   }

  public static void main(String[] args){
 int list1[]={2,1,5,6,2,3};     
   System.out.println(maxa(list1));
} 
}