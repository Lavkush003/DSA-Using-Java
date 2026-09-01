

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



    }
}
