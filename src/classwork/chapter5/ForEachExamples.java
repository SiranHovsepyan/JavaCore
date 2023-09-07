package classwork.chapter5;

public class ForEachExamples {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int x:nums) {
            System.out.print(x+" ");
            sum += x;
            if(x==5) break;
        }
        System.out.println(sum+" ");
    }
}
