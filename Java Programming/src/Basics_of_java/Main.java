package Basics_of_java;



class Arrays{
    void max(){
        int[] arr = {1,5,3,6,8,5,8};
        int x=5;
        int ans = -1;
        for(int i=0;i< arr.length; i++) {
            if (x == arr[i]) {
                ans = i;
                System.out.println(i);
            }
        }
//        System.out.println(ans);
    }
}
public class Main{
    public static void main(String[] args) {
        Arrays obj = new Arrays();
        obj.max();


    }
}

