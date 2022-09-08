import java.util.Arrays;

public class Solution1_2 {

    public static void main(String[] args) {
        int[] r1 =new int[]{1,7,3,6,5,6} ;
        System.out.println(pivotIndex1(r1));

    }
    public static int pivotIndex(int[] nums) {
        for (int i =0;i< nums.length;i++){
//            System.out.println("index:"+i);

            int leftSum = 0;
            int j = i-1;
            while(j>=0){
//                System.out.println("j"+j);
//
//                System.out.println("added"+nums[j]);
                leftSum+=nums[j];
                j--;
            }

            int rightSum=0;
            int k = i+1;
            while(k< nums.length){
                rightSum+=nums[k];
                k++;
            }

//            System.out.println(leftSum);
//            System.out.println(rightSum);;
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }

    public static int pivotIndex1(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
