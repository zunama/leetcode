public class P724 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {2,1,-1}));
    }

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum == (total - sum - nums[i])){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
