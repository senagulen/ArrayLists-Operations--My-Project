package app;
import java.util.ArrayList;


/**
 *  This class provides methods that perform operations on a list of generic objects.
 *  The Objects are assumed to have an appropriate implementation of the equals method.
 */
public class ArrayListServices <T> {


   /**
    * This method takes an ArrayList as a parameter and returns a new ArrayList that
    * does not contain any duplicate data. For example, if this list was passed in:
    * [A, B, D, A, A, E, B], the method would return a list containing: [A, B, D, E].
    * The ordering of the data does not matter.
    * Assume that the parameter is not null, but it may be an empty ArrayList, in which case
    * your method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the
    * same as the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> deDuplicate(ArrayList<T> inputList){
      //Write your comments on how you implemented the method.
      /**
       Created a new list, and you iterate through the parameter and add to the new array and check if it contains the value as it adds them.
      **/
     
      //TODO: Implement this method.
      ArrayList<T> arr = new ArrayList<T>();


      for (T value : inputList) {
        if (!arr.contains(value)){
            arr.add(value);
        }
      }
      return arr;
   }


   /**
    * This method takes two ArrayLists as parameters and returns a new ArrayList that
    * contains the intersection of the data in the ArrayLists passed in. The intersection
    * contains the elements that occur in both lists.
    * For example, if these lists were passed in: [A, B, D, A, A, E, B], [B, E, C], the method
    * would return a list containing: [B, E]. The ordering of the data does not matter. Note that
    * the result does not contain any duplicates.
    * Assume that the parameters are not null, but one or both may be an empty ArrayList, in which
    * case your method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the same as
    * the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> getSetIntersection(ArrayList<T> listA, ArrayList<T> listB){
      //Write your comments on how you implemented the method.
      /**
       Create a new array and iterate through one of the parameters and then check the second parameter to see if it contains the value. If it does, add to new array. Afterwards, deduplicate the list to ensure no repeated values.
      **/
     
      //TODO: Implement this method.
      ArrayList<T> arr = new ArrayList<T>();
      for (T value : listA) {
        if (listB.contains(value)) {
            arr.add(value);
        }
      }
      return deDuplicate(arr);
   }


   /**
    *  This method takes two ArrayLists as parameters and returns a new ArrayList that
    * contains the set difference of the data in the ArrayLists passed in. The set difference
    * contains the elements that occur only in one or the other list, but not in both.
    * For example, if these lists were passed in: [A, B, D, A, A, E, B], [B, E, C], the method
    * would return a list containing: [A, D, C]. The ordering of the data does not matter. Note
    * that the result does not contain any duplicates.
    * Assume that the parameters are not null, but one or both may be an empty ArrayList. In the
    * case where one list is empty, your method returns a new ArrayList that contains all of the
    * elements on the other list- with no duplicates. In the case where both lists are empty, your
    * method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the same
    * as the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> getSetDifference(ArrayList<T> listA, ArrayList<T> listB){
      //Write your comments on how you implemented the method.
      /**
       Create the array. Iterate through one of the parameters and make sure the other parameter doesn't contain it. Then iterate throguh the other parameter and make sure the first one doesn't contain it. Finally, use deduplicate to remove the extra text leaving just the set.
      **/
     
      //TODO: Implement this method.
        ArrayList<T> arr = new ArrayList<T>();
        for (T value : listA) {
            if (!listB.contains(value)) {
                arr.add(value);
            }
        }


        for (T value : listB) {
            if (!listA.contains(value)) {
                arr.add(value);
            }
        }


      return deDuplicate(arr);
   }


}

