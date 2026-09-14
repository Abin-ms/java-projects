package leetcode;

public class findmaxandmmininarray {
    public static void main(String[] args){
        int[] arrayy = { 1,2,3,4,5,6,10};

        int highest = arrayy[0];
        int lowest = arrayy[0];

        for(int i = 0 ; i < arrayy.length ; i++){
            if( arrayy[i] > highest){
                highest = arrayy[i];
            }
            if( arrayy[i] < lowest){
                lowest = arrayy[i];
            }
        }
        
        System.out.println("Highest element in the array : "+ highest);
        System.out.println("Lowest element in the array : "+lowest);
    }
}
