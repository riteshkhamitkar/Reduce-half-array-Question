class Solution {
    public int minSetSize(int[] arr) {
        int max =0;
        for(int x: arr)
            if(x>max)
                max = x;
        int [] freq= new int[max+1];
        
        for(int x : arr)
            freq[x]++;
        
        ArrayList<Integer>  a = new ArrayList<>();
        for(int x: freq)
            if(x!=0)
                a.add(x);
        
        Collections.sort(a);
        
        int c=0;
        int sum=0;
        for(int i=a.size()-1;i>=0;i--)
        {
            sum+= a.get(i);
            c++;
            if(sum >= arr.length/2)
                return c;
        }
        return arr.length;
    }
}