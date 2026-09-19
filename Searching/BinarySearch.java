package Searching;

public class BinarySearch {
    public static int binary(int[]nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 9;
        System.out.println(binary(nums, target));
    }
}
