package SARS.SARS0912;

public class 移除元素2 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
    private static int removeElement(int[] nums, int val) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}