public class RecursionBasics{

  public static void printDec(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }

  public static void printInc(int n){
    if(n==1){
        System.out.print(1+" ");
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
  }
  //factorial of n

  public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fact_n_1=fact(n-1);
    int fact_n=n*fact_n_1;
    return fact_n;

  }

  //fibonacci of n

  public static int fibo(int n){
    if(n==0 || n==1){
        return n;
    }
    int fibo_n_1=fibo(n-1);
    int fibo_n_2=fibo(n-2);
     int fb= fibo_n_1+fibo_n_2;
    return fb;
  }

  //first Occurence of an element in an array

  public static int firstOccurence(int arr[], int key, int i){
    if(i==arr.length){
        return -1;
    }
    if(arr[i]==key){
        return i;

    }

    return firstOccurence(arr, key, i+1);
  }

  public static int lastOccurence(int arr[], int key, int i){
    if(i==arr.length){
        return -1;
    }

    int isFound=lastOccurence(arr, key, i+1);

    if(isFound==-1 && arr[i]==key){
        return i;
    }
    return isFound;
  }

  // x power n

  public static int power(int x, int n){
    if(n==0 ){
        return 1;
    }
    // int xm1=power(x,n-1);
    // int xn=x*xm1;
    // return xn;

    return x * power(x, n-1);


  }

  //Tiling Problem

  public static int tilingProblem(int n){ // 2 x n (floor size)

  //base case

  if(n==0 || n==1){
    return 1;
  }
  //kaam

  //vertical choice

  int fnm1=tilingProblem(n-1);

  //horizontal choice

  int fnm2=tilingProblem(n-2);

  int totalways=fnm1+ fnm2;
  return totalways;

  }

  // remove duplicates from a string

  public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
    if(idx==str.length()){
      System.out.println(newStr);
      return;
    }

    //kaam
    char currChar=str.charAt(idx);

    if(map[currChar-'a']==true){
      //duplicate
      removeDuplicates(str, idx+1, newStr,map);
    }else{
      map[currChar-'a']=true;
      removeDuplicates(str, idx+1, newStr.append(currChar), map);
    }
  }

  //Friends pairing problem

  public static int friendsPairing(int n){
    if(n==1 || n==2){
      return n;

    }

    //choice
    
    //single

    int fnm1=friendsPairing(n-1);

    //pair
    int fnm2=friendsPairing(n-2);
    int pairWays=(n-1)* fnm2;

    //totalWays
    int totalWays=fnm1+pairWays;
    return totalWays;
  }

  //Binary String Problem

   public static void printBinStrings(int n, int lastPlace, String str){
    //base case
    if(n==0){
      System.out.println(str);
      return;
    }
    //kaam
    printBinStrings(n-1, 0, str+"0");
    if(lastPlace==0){
      printBinStrings(n-1, 1, str+"1");
    }
   }
  public static void main(String args[]){
    int n=10;
    printDec(n);
    printInc(n);

    System.out.println();
    System.out.println(fact(5));

    System.out.println(fibo(10));

    int arr[]={8,3,6,9,5,10,2,5,3};
    System.out.println(firstOccurence(arr, 5, 0));
    System.out.println(lastOccurence(arr, 5, 0));
    System.out.println(power(2, 5));

    System.out.println(tilingProblem(3));

String str="appnacollege";
removeDuplicates(str,0,new StringBuilder(""), new boolean[26]);


System.out.println(friendsPairing(3));

System.out.println("Binary Strings of length 3");
printBinStrings(3, 0, "");

  }

}