class Solution {
    public int search(int[] arr, int value) {
        int i = 0;
        int j = arr.length-1;
        int mid;
        while(i <= j){
            if(arr[i] == value) return i;
            mid = (j-i)/2 + i;
            if(arr[mid] == value) return mid;
            
            if(arr[mid] < value) i = mid+1;
            else if(arr[mid] > value) j = mid-1;
        }
        return -1;
    }
}