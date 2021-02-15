//Collections.reverse()
import java.util.*;

public class Reverse{
     public static void main(String[] args) {
         //create an ArrayList object
            ArrayList<String>arrayList = new ArrayList<String>();

          //Add elements to Arraylist 
           arrayList.add("A");
           arrayList.add("B");
           arrayList.add("C");
           arrayList.add("D");
           arrayList.add("E");

           System.out.println("Before Reverse Order,ArrayList Contains:"+ arrayList);

           //Here we are using reverse() method
           //to reverse the element order of arrayList
             Collections.reverse(arrayList);

             System.out.println("After Reverse Order,ArrayList Contains:"+ arrayList);

        
    }
}