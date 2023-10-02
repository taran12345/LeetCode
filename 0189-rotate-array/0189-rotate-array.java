class Solution {
    public static void reverse(int a[], int start, int end){
            while (start < end) {
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                    start++;
                    end--;
                }
        }
    
    public int[] rotate(int[] a, int k) {
        int n=a.length;
        k=k%n;
        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
        return a;
    }
}