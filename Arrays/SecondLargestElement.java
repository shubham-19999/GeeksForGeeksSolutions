class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE ;
        if( n < 2 )
        return -1;
        
        for(int i = 0 ; i < n ; i++)
        {
            if ( arr[i] > large)
            {
                secondLarge = large;
                large = arr[i];
            }
            else if (arr[i] > secondLarge && arr[i] != large)
                secondLarge = arr[i];
        }
        if(secondLarge == Integer.MIN_VALUE) return -1;
        else return secondLarge;
    }
}
