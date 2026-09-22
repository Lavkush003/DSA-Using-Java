
// import java.util.*;

// public class SortingArrayList {
//     public static void main(String args[]){
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         System.out.println(list);
//         Collections.sort(list); //ascending order sorting
//         System.out.println(list);

//         Collections.sort(list, Collections.reverseOrder()); //descending order sorting
//         System.out.println(list); 

//     }
// }




//Pair Sum-1
//Find if any pair in a sorted ArrayList has a target sum
//list =[1,2,3,4,5,6], target=5



//Brute Forace Approach


import java.util.*;
public class SortingArrayList{
    

// public static boolean pairSum1(ArrayList<Integer>list,int target){  O(n^2) time complexity
//     for(int i=0;i<list.size();i++){
//         for(int j=i+1;j<list.size();j++){
//             if(list.get(i)+list.get(j)==target){
//                 return true;
//             }
//         }

//     }
//     return false;

// }   

//two pointer approach

public static boolean pairSum1(ArrayList<Integer>list, int target){
    int left=0;
    int right=list.size()-1;
    while(left!=right){
        if(list.get(left)+list.get(right)==target){
            return true;
        }
        else if(list.get(left)+list.get(right)<target){
            left++;
        }
        else{
            right--;
        }
    }
    return false;
}
 public static void main(String args[]){

        ArrayList<Integer>list=new ArrayList<>();

        //1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;

        System.out.println(pairSum1(list,target));
    }
}
