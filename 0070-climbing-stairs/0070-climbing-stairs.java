class Solution {
    
    public static int climb(int n, int a[]){
        if(n<=1) {
            a[n]=1;
            return 1;
        }    
        if(a[n]!=-1)
            return a[n];
        
        a[n] = climb(n-1,a) + climb(n-2,a);
        return a[n]; 
    }

    public static int climbStairs(int n) { 
        int a[] = new int[n+1];
        Arrays.fill(a,-1);
        return climb(n,a);
    }
}