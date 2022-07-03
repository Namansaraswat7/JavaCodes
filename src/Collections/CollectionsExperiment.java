package Collections;

import java.util.*;

public class CollectionsExperiment {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Bananna");
        fruits.add("Strawbery");

//        for(int i=0; i<fruits.size();i++)
//        {
//            System.out.println(fruits.get(i));
//            if("Apple".equals(fruits.get(i)));
//            fruits.remove(i);
//        }

        //Removing in the enhanced for statement Throws Exception:
//        for(String fruit: fruits)
//        {
//            System.out.println(fruit);
//            if("Apple".equals(fruit))
//                fruits.remove(fruit);
//        }

        Iterator<String> fruitItr = fruits.iterator();
        while(fruitItr.hasNext())
        {
            String fruit = fruitItr.next();
            System.out.println(fruit);

            if("Apple".equals(fruit))
                fruitItr.remove();


        }



    }
}
