import java.util.*;
import java.util.stream.*;

class StreamApiProblem 
{ 
  public static void main(String args[]) 
  { 

    List<String> strList = new ArrayList<>();
    strList.add("Vikram Singh");
    strList.add("Jai Singh");
    strList.add("Vivek Shukla");
    strList.add(("Suraj Pandey"));

    // Using For Each
    strList.stream().filter(str-> str.contains("V")).forEach(res->System.out.println(res));

    //Collect 
    List<String> result = strList.stream().filter(str->str.contains("i")).collect(Collectors.toList());
    System.out.println(result);

    List<Integer> numberList = new ArrayList<>();
    numberList.add(10);
    numberList.add(13);
    numberList.addAll(Arrays.asList(12,30,32,33,57));

    //Sorted + Map
    List<Integer> res = numberList.stream().sorted().map(x->x/10 + 5).collect(Collectors.toList());
    System.out.println(res);

    numberList.stream().map(x->x*1.5).forEach(res1->System.out.println(res1));

    int num = numberList.stream().map(x->x*3).filter(x->x%2==0).reduce(0,(ans,value)->ans+value);
    System.out.println("Reduce ::  "+num);
  }
}    