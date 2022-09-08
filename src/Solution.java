import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] r1 =new int[]{1,1,1,1} ;
        int[] r = runningSum(r1);
        System.out.println(Arrays.toString(r));

    }
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0;i< nums.length;i++){
            int value=nums[i];
            int j = i;
            while(j>0){
                value+=nums[j-1];
                j--;
            }
//            for (int j= i;j>=0;j--){
//                value+=nums[j];
//            }
            result[i]=value;
        }
        return result;
    }
}