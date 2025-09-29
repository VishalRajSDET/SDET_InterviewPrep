package JavaCoding.DSA.ArrayEasyToMediumQuestions;

public class MaximumSubarraySum {
    /**
     * ✅ Best Solution → Kadane’s Algorithm (O(n) time, O(1) space)
     */
    public static int maximumSubarraySum(int[] arr){
        int maxSofar=arr[0];
        int curSum=arr[0];
        for(int i=1;i<arr.length;i++){
            curSum=Math.max(arr[i],curSum+arr[i]);
            maxSofar=Math.max(curSum,maxSofar);
        }
        return maxSofar;
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum :"+maximumSubarraySum(arr));
    }
}
