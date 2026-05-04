// Extremely simple hashmap program in java and step by step. Like the program should be first how to input data then to retrieve data and then to print all the data. Also the implementation on containskey and containsvalue.
import java.util.HashMap;
public class hashmap2{
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Samia", 1);
        hm.put("Sam", 2);
        hm.put("Sam", 2);

        System.out.println(hm.get(1));

        System.out.println(hm.containsKey(2));
        System.out.println(hm.containsKey(5));

        System.out.println(hm);
    }
}