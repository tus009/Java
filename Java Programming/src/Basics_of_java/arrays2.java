package Basics_of_java;



public class arrays2 {
    public static void main(String[] args) {
        int[] arr1 = {5,2,5,4,5,6,5};
        int count = 0;
        int x = 5;
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]==x){
                count++;
            }

        }System.out.println(count);
    }

}
