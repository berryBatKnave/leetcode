class Solution {
    public int[] twoSum(int[] a, int k) {
        int n = a.length;
        int [] b = new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==k && i!=j){
                    b[0] = i;
                    b[1] = j;
                }
            }
        }
        return b;
    }
}
