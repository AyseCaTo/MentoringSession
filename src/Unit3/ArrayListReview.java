package Unit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {

    /*
    [3.3] ArrayList

    Data Structures:
    1. Array: size is fixed, [], supports primitives & non primitive
    2. Collection: size is dynamic, does not support primitives
    3. Map: size is dynamic, does not support primitives

    -What is ArrayList and how is it different from Arrays
    ArrayList is a class and part of collection in the Java that is similar to an array and allows you to store objects.Each object in arraylist, has its own index number.
        Differences between Arrays and ArrayList
        *Array is an object, ArrayList is a class
        *Array's size fixed, ArrayList' size is DYNAMIC
        *Array supports primitive and non-primitives, ArrayList does NOT support primitives
        *Array does not have add or remove function, but ArrayList has
        *Array can be multi-dimensional but ArrayList cannot be multi-dimensional

    -Can collections store primitives or objects
        NO

    -All the ArrayList methods we went through
        *add(object): adds elements to the next available index
        *add(index, object): adds the element to the given index
        *get(index): gets the element at given index
        *size(): returns the total number of the elements (same with length in array)
        *set(index, new element): replaces the old element at given index with the given new element
        *remove(index): removes the object at the given index, does not return (void), remove one object at a time
        *remove(object): remove the first matching object, returns boolean, remove one object at a time
        *clear(): clears the list, size will be 0
        *indexOf(object): returns first matching objects index num, as int
        *lastIndexOf(object): returns last matching objects index num, as int
        *contains(object): verifies if the object is contained in the list, returns boolean
        *equals(ArrayList): compares if the given list is equal to the list, returns boolean
        *isEmpty(): checks if the list is empty (if size 0)

        Bulk Operations:
        *containsAll(CollectionType): verifies if the collection of elements are contained or not
        *addAll(CollectionType): adds multiple elements into the arraylist
        *removeAll(CollectionType): removes all matching elements from array list
        *retainAll(CollectionType): removes all the elements that are not matching. removeAllExcept

        Collections:
        *Collections.sort(ArrayList): sorts the arraylist in ascending order
        *Collections.swap(ArrayList, index1, index2 ): swaps the elements at given indexes
                   [1,2,3,4,5]
            set(0, 5)==> {5,2,3,4,5}
            swap ==> [5,2,3,4,1]
        *Collections.replaceAll(ArrayList, Old Value, New Value): replaces the old values with new one in given arrayList
        *Collections.frequency(ArrayList, Element): returns the frequency o9f the given element, int
            list: ['A', 'A', 'B', 'A', 'C', 'A'];
            Collections.frequency(list, 'A') ==> 4
        *Collections.max(ArrayList)
        *Collections.min(ArrayList)

    -There will be NO questions using predicate
    */

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Egg");

        groceryList.add(0, "Toilet Paper");
        groceryList.add(1,"Sanitizer");
        groceryList.add(1, "N95 Masks");

        groceryList.addAll(Arrays.asList("Paper", "Pen", "Sticker", "Crayon"));

        groceryList.set(1,"apple");

        System.out.println(groceryList.indexOf("Egg"));
        System.out.println(groceryList.lastIndexOf("Egg"));

        System.out.println(groceryList.contains("Java"));
        System.out.println(groceryList.contains("Bread"));
        System.out.println(groceryList.containsAll(Arrays.asList("Bread", "Egg", "Milk")));


        groceryList.remove(1);
        groceryList.remove("Milk");

        groceryList.removeAll(Arrays.asList("Bread", "Pen", "Toilet Paper"));

        //groceryList.retainAll(Arrays.asList("Paper"));


        System.out.println(groceryList);

        String item1 =  groceryList.get(2);

        System.out.println("item1 = " + item1);

        String item2 = groceryList.get(1);
        System.out.println("item2 = " + item2);

         // System.out.println( groceryList.get(100)  );

        int total = groceryList.size();  // returns int
        System.out.println("total = " + total);

        System.out.println( groceryList.get(  groceryList.size()-1) );

        ArrayList<String> shoppingList = new ArrayList<>(groceryList);

        System.out.println(groceryList==shoppingList);
        System.out.println(groceryList.equals(shoppingList));

        System.out.println("================================================");

        Collections.sort(groceryList);
        Collections.swap(groceryList, 2,3);
        Collections.swap(groceryList, groceryList.indexOf("Egg"), groceryList.indexOf("Water"));
        Collections.replaceAll(groceryList, "Egg", "Meat");
        int frequencyOfMeat = Collections.frequency(groceryList, "Meat");
        System.out.println(frequencyOfMeat);

        //System.out.println(Collections.max(groceryList));

        groceryList.clear();

        System.out.println(groceryList.isEmpty());
        
    }


}
