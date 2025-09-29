package CollectionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayListCode {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
      /*  al.add("Aa");
        al.add("Zz");
        al.add("Yy");
        al.add("Xx");
        System.out.println("print the all the values from the List :"+al);
        Collections.sort(al);// It will sort the current list
        System.out.println("Sort the arrayList :"+al);
        Collections.reverse(al);// It will reverse current list
        System.out.println("Reverse the arrayList :"+al);*/

        /**
         *   Array List
         */
        /*---------------------------------------------------------------------------------------------------
        ArrayList<String> ar = new ArrayList<>(Arrays.asList("vishal", "aman", "Vishal", "Aman", "Lavkush"));
        System.out.println(ar);
        System.out.println(ar.get(3));//get() method is used for to get particular index value
        System.out.println("Size of arrayList :"+ar.size());// size of ArrayList
        ar.set(0,"Vishal raj");
        System.out.println("After set new value at index zero :"+ar);
        ar.remove("Vishal");// delete or remove item from arraylist
        System.out.println("After removed Vishal :"+ar);
        ar.clear();//clear arralist
        System.out.println("Claer array list :"+ar );

        -----------------------------------------------------------------*/

        /**
         *   Array List--> Convert ArrayList in to Array
         */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(cars.size()-1);
        System.out.println(cars);
        String[] carArray=new String[cars.size()];
        carArray=cars.toArray(carArray);
        System.out.println("After convert arrayList in to Array :"+ Arrays.toString(carArray));//Arrays.toString() is used for to print array values




    }
}
