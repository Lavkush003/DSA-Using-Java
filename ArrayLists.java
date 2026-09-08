

//Introduction to ArrayList in Java
//Array                                              ArrayList

//fixed size                                        dynamic size
                                       
//primitive data                                    primitive data types
// types can be stored                              cannot be stored directly






import java.util.*;
import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String args[]){
        //Java Collection Framework
        //ClassName objectName=new ClassName();

        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        
        list.add(1);  //O(1) time complexity
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);



        //operations on ArrayList
        //1. get(index)-->O(1)
        System.out.println(list.get(2));  // Output: 3

        //2. set(index,element)-->O(1)
        list.set(2, 10);
        System.out.println(list);  // Output: [1, 2, 10, 4]

        //3. remove(index)-->O(n)
        list.remove(1);
        System.out.println(list);  // Output: [1, 10, 4]

        //4. size()-->O(1)
        System.out.println(list.size());  // Output: 3      

    

    }
}
