import java.util.*;
public  class stockspan{
   public static ArrayList<Integer> span(ArrayList<Integer>stockspan)
   {
      Stack<Integer>s=new Stack<>();
      int max=-1;
      ArrayList<Integer>span1=new ArrayList<>();
      s.push(0);
      span1.add(1);
      int i;
      for(i=1;i<stockspan.size();i++){
         while(stockspan.get(i)>stockspan.get(s.peek())){
                s.pop(); 
         } 
         if(s.empty()){
            span1.add(stockspan.size());
         }
         else{
            int k=i-s.peek();//s.peek() is prevhigh
            span1.add(k);

         }
         s.push(i);
      }
      
return span1;
   }
  public static void main(String[] args){
    ArrayList<Integer>span1=new ArrayList<>();
    ArrayList<Integer>stockspan=new ArrayList<>();
    stockspan.add(100);
    stockspan.add(80);
    stockspan.add(60);
    stockspan.add(70);
    stockspan.add(60);
    stockspan.add(85);
    stockspan.add(100);
int i=0;
span1=span(stockspan);
for(i=0;i<span1.size();i++){
   System.out.println(span1.get(i));
}

  
}
}