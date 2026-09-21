
//Segregate elemnts odd, even elements of a LinkedList
//Input-> 1->6->5->12->7->8
//output-> 1->5->7->6->12->8

import java.util.*;
public class Segregate {

    public static void main(String args[]){
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(12);
        list.add(7);
        list.add(8);

        LinkedList<Integer>odd=new LinkedList<>();
        LinkedList<Integer>even=new LinkedList<>();

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                even.add(list.get(i));
            }
            else{
                odd.add(list.get(i));
            }
        }
        odd.addAll(even);
        System.out.println(odd);
    }
    
}
