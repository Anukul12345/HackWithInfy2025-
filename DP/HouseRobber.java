public class HouseRobber {
    public static void main(String[] args) {
        int nums[]={2,7,9,3,1};
        System.out.println(maxRob(nums));
    }
    public static int maxRob(int nums[]){
        int inc=nums[0];
        int exc=0;
        for(int i=1; i<nums.length; i++){
            int new_inc=exc+nums[i];
            int new_exc=Math.max(exc,inc);

            inc=new_inc;
            exc=new_exc;
        }
        return Math.max(inc,exc);
    }
}
