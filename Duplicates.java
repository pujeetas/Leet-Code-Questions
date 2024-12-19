public class Duplicates {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int unique =0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                unique++;
                nums[unique] = nums[i];
            }
        }
        System.out.println(unique+1);
    }
}