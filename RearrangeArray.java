


//Rearrange the given array in such a way that:
// i> the array should start from a positive integer
//ii>every alternate elements should be of opposite sign
//iii> relative order should be unchnanged

import java.util.*;


public class RearrangeArray {
    public static void main(String args[]){
        int arr[]={-1,-2,4,5,-7,6};

      ArrayList<Integer>pos=new ArrayList<>();
      ArrayList<Integer>neg=new ArrayList<>();

      for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            pos.add(arr[i]);
        }
        else{
            neg.add(arr[i]);
        }
      }
      int p=0;
        int n=0;
        int i=0;
        while(p<pos.size() && n<neg.size()){
            if(i%2==0){
                arr[i]=pos.get(p);
                p++;
            }
            else{
                arr[i]=neg.get(n);
                n++;
            }
            i++;
        }
        while(p<pos.size()){
            arr[i]=pos.get(p);
            p++;
            i++;
        }
        while(n<neg.size()){
            arr[i]=neg.get(n);
            n++;
            i++;
        }     
        System.out.println(Arrays.toString(arr));      
    }
}


