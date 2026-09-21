

// //Introduction to ArrayList in Java
// //Array                                              ArrayList

// //fixed size                                        dynamic size
                                       
// //primitive data                                    primitive data types
// // types can be stored                              cannot be stored directly






// import java.util.*;
// import java.util.ArrayList;

// public class ArrayLists {
    
//     public static void main(String args[]){
//         //Java Collection Framework
//         //ClassName objectName=new ClassName();

//         ArrayList<Integer>list=new ArrayList<>();
//         ArrayList<String>list2=new ArrayList<>();
//         ArrayList<Boolean>list3=new ArrayList<>();
        
//         list.add(1);  //O(1) time complexity
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         System.out.println(list);



//         //operations on ArrayList
//         //1. get(index)-->O(1)
//         System.out.println(list.get(2));  // Output: 3

//         //2. set(index,element)-->O(1)
//         list.set(2, 10);
//         System.out.println(list);  // Output: [1, 2, 10, 4]

//         //3. remove(index)-->O(n)
//         list.remove(1);
//         System.out.println(list);  // Output: [1, 10, 4]

//         //4. size()-->O(1)
//         System.out.println(list.size());  // Output: 3      

    

//     }
// }



//print max in an arraylist

import java.util.*;
public class ArrayLists{

    //swap two numbers in an arraylist

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String args[]){

        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

       int max=Integer.MIN_VALUE;
       for(int i=0;i<list.size();i++){
        if(max<list.get(i)){
            max=list.get(i);
        }
       }
       System.out.println("Max element = " + max);

       int idx1=1, idx2=3;
       System.out.println(list);
       swap(list, idx1, idx2);
       System.out.println(list);

    }
}
