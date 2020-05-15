
import java.util.Arrays;
import java.util.HashSet;
 
public class CommonString 
{
  public static void main(String[] args) 
  {
    String first = "AGGTAB";
    String second = "GXTXAYB";
    String[] firstArray=first.split("");
    String[] secondArray=second.split("");
    

    HashSet<String> set = new HashSet<String>(); 
    
    set.addAll(Arrays.asList(firstArray));
    set.retainAll(Arrays.asList(secondArray));
    System.out.println(set);
    System.out.println(set.size());
    for(String s:set) {
    	System.out.println(s);
    }
     /*
    //convert to array
    String[] intersection = {};
    intersection = set.toArray(intersection);
     
    //System.out.println(Arrays.toString(intersection));*/
  }
}