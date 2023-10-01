class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n =arr.length;
        Set<List<Integer>> ll = new  HashSet<>();
        List<Integer> l = null;
        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> s = new HashSet<Integer>();    // creating new set for each iteration
            for (int j = i + 1; j < n; j++) {
                int x = -(arr[i] + arr[j]);     //third element
                if (s.contains(x)) {
                    l=new ArrayList<>();
                    l.add(x); l.add(arr[i]); l.add(arr[j]);
                    Collections.sort(l);
                    ll.add(l);
                }
                else {
                    s.add(arr[j]);
                }
            }
            
            }
            List<List<Integer>> lll = new ArrayList<>();
            lll = ll.stream().collect(Collectors.toList());
        return lll;
    }
}