package SARS.SARS0914;

public class 删除重复元素 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    private static int removeDuplicates(int[] nums) {
        int len = 0;//计长度
        int i;
        if(nums == null || nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return 1;
        }
        for(i = 0;i<nums.length;i++)
            if(nums[i] != nums[len]){
                len++;
                nums[len] = nums[i];
            }
        len++;
        return len;
    }
}
