package Assignment;
import java.util.*;


public class ocurrencesOfEachElement {

  public static void countFrequency(int [] arr,int n) {

      Map<Integer, Integer> map = new HashMap<>();


      for (int i = 0; i < n; i++) {

          if (map.containsKey(arr[i])){

              map.put(arr[i],map.get(arr[i])+1);
          }else{
              map.put(arr[i],1);
          }
      }

//
//      for (Map.Entry<Integer, Integer> entry : map.entrySet())
//      {
//          System.out.println(entry.getKey() + " -" +entry.getValue());
//      }

      //  ==== or=====


      for (int key : map.keySet())
      {
          System.out.println("element: "+key+ " - frequency: " +map.get(key));
      }
  }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFrequency(arr, n);
    }

}

