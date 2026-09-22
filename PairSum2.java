

//Pair Sum-2
//Find if any pair in a Sorted & Rotated ArrayList has a target sum

//list =[11,15,6,8,9,10], target=16



import java.util.*;

public class PairSum2 {
    public static boolean pairSum2(ArrayList<Integer>list, int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){ //breaking point
                bp=i;
                break;

            }
        }
        int left=bp+1; //smallest
        int right=bp; //largest
        while(left!=right){
            //case 1
            if(list.get(left)+list.get(right)==target){
                return true;
            }

            //case 2
            if(list.get(left)+list.get(right)<target){
                left=(left+1)%n;
            }else{
                //case 3
                right=(n+right-1)%n;
            }
        }
   return false;

    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //11,15,6,8,9,10 - Sorted & Rotated 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;

 System.out.println(pairSum2(list,target));

    }
}
