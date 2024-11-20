package me.schuman;

public class MargeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLength = m+n;
        // create a temp array with combined length of m + n
        int[] out = new int[totalLength];
        // track indexes for nums1 and nums2
        int i1 = 0, i2 = 0;

        // loop the combined length of both arrays
        for (int i = 0; i < totalLength; i++) {
            /*  append from nums1 if the nums1 index is < nums1 length and if either
                nums2 index is >= nums2 length or the current value in nums1 is < the
                current value in nums2 */
            if (i1 < m && (i2 >= n || nums1[i1] < nums2[i2])) {
                // since we're adding from nums1, increment its index
                out[i] = nums1[i1++];
            }
            // if we added everything from nums1 or the current value in nums1 is
            // not less than the current value of nums2, add from nums2
            else {
                // since we're adding from nums2, increment its index
                out[i] = nums2[i2++];
            }
        }

        // copy all from temp array to nums1
        for (int i = 0; i < totalLength; i++) {
            nums1[i] = out[i];
        }
    }
}
