
import java.util.*;

// Implement an Iterator class that iterates over every second element in a array 

public class ArrayIterator implements Iterable<Integer>{
 
  private int[] array;
  public ArrayIterator(int[] a){
    array=a;
  }
  
  public Iterator<Integer> iterator(){
    return new InnerIterator();
  }
  
  private class InnerIterator implements Iterator<Integer>{
    
    
    int i=0;
    
    
    public boolean hasNext(){
      
      if(i>=array.length){
        return false;
      }
      
      return true;
      
    }
    
    public Integer next(){
      
      int res=array[i];
      i+=2;
      return res;
    }
  }
  
  
  public static void main(String[] args){
    
    int[] input =  {2,4,5,6,78,12,14,36,67,70};
    ArrayIterator AI = new ArrayIterator(input);
    Iterator<Integer> it = AI.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    
  }
  
}

