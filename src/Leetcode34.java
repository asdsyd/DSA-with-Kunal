public class Leetcode34 {
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] arr, int t) {
        int l = 0, h = arr.length - 1;
        int fp = -1, lp = -1;
         int a[] ={-1,-1};
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                fp = mid;
                h = mid - 1;
            } else if (arr[mid] > t) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if(fp==-1){
            return a;
        }
        l = fp;
        h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                lp = mid;
                l = mid + 1;
            } else if (arr[mid] > t) {
                h = mid - 1;
            } else {

            }
        }
        a[0]=fp;
        a[1]=lp;
       
        return a;
    }
}
