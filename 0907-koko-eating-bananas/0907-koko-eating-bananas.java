class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low = 1; int high = findMax(piles); 
      while(low<high) {
        int mid = (low+high)/2;
        // System.out.println("mid - " + mid);
        int totalHours = calculateHours(piles,mid);
        // System.out.println(totalHours);
        if(totalHours <=h) {
            high = mid;
        }
        else{
            low = mid +1;
        }
      } 
      return low;
    }
    public int findMax(int[] piles){
        int n = piles.length;
        int max = 0;
        for (int i =0; i<n; i++ ) {
           max = Math.max(max,piles[i]);
        }
        return max;
    }

    public int calculateHours(int[] piles, int mid) { 
        int totalHours = 0;
        for (int i =0; i<piles.length;i++) {
            // totalHours +=  Math.ceil((double)piles[i]/mid);

            // System.out.println(totalHours);
            totalHours += (piles[i]/mid);
            if(piles[i]%mid != 0) totalHours++;
        }

        return totalHours;

    }

}