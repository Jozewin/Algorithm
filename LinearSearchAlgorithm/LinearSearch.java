package LinearSearch;

import java.util.Arrays;

public class LinearSearch {

    // to find in a array - o(n)
    public static int find(int arr[],int target){
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==target) return i;
        }
        return -1;
    } 

    // to check if exist in a array - o(n)
    public static boolean contains(int arr[],int contains){
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==contains) return true;
        }
        return false;
    }

    // to find a char in a String - O(n)
    public static int find(String toFind,Character find){
        for (int i = 0;i<toFind.length();i++){
            if(toFind.toLowerCase().charAt(i)==find)  return i++;
        }
        return -1;
    }

        // to check if a char exist in a String - O(n)
    public static boolean contains(String toFind,Character find){
        for (int i = 0;i<toFind.length();i++){
            if(toFind.toLowerCase().charAt(i)==find)  return true;
        }
        return false;
    }

    // to find a element in a 2D array
    public static int[] find (int arr [][],int target){
        for (int row = 0; row<arr.length;row++){
            for ( int col = 0;col<arr[row].length;col++){
                if(arr[row][col]==target)   return new int[] {row,col};
            }
        }
        return new int[] {-1,-1};

    }

    /*
     * HomeWork
     * 
     * find maximum number 
     * find minimum number
     * cout a character in a String , "Josewin " how many 'o'
     * count number of 4 digit numbers in a arr {1234,4,23,4,0987,23,1344}
     */

     public static int findMax(int []arr){  // O(N)
        int biggest = arr[0];
        for(int j = 1;j<arr.length;j++){
            if (arr[j]>biggest)     biggest = arr[j];
        }
        return biggest;
    }

    public static int findMin(int []arr){   // O(N)
        int lowest = arr[0];
        for (int j = 0;j<arr.length;j++){
            if(arr[j]<lowest)   lowest = arr[j];
        }
        return lowest;
    }

    // Count a character in a String

    public static int numOfChar(String find,Character target){
        int num = 0;
        for (int i = 0;i<find.length();i++){
            if(find.toLowerCase().charAt(i)==target)  num++;
        }
        return num;
    }        

    //to count four digits in a array
    public static int toCountElemInArray(int arr[]){
        int result =0,j;
        for (int i = 0;i<arr.length;i++){
            int num = arr[i];
            String ans = Integer.toString(num);
            for(j = 0;j<ans.length();j++)
            {}
           // System.out.println(j);
            if( j==4)   result++;
        }
        return result;
    }
}
