1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        // Ensure nums1 is the smaller array to minimize the binary search range
4        if (nums1.length > nums2.length) {
5            return findMedianSortedArrays(nums2, nums1);
6        }
7        
8        int m = nums1.length;
9        int n = nums2.length;
10        int low = 0;
11        int high = m;
12        
13        while (low <= high) {
14            // Partition index for nums1
15            int partitionX = (low + high) / 2;
16            // Partition index for nums2
17            int partitionY = (m + n + 1) / 2 - partitionX;
18            
19            // If partitionX is 0, nothing is on the left side for nums1. Use -Infinity
20            // If partitionX is m, nothing is on the right side for nums1. Use +Infinity
21            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
22            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
23            
24            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
25            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
26            
27            // Check if we found the correct partition
28            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
29                // If the total number of elements is even
30                if ((m + n) % 2 == 0) {
31                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
32                } else { // If the total number of elements is odd
33                    return (double) Math.max(maxLeftX, maxLeftY);
34                }
35            } else if (maxLeftX > minRightY) {
36                // We are too far right in nums1, move left
37                high = partitionX - 1;
38            } else {
39                // We are too far left in nums1, move right
40                low = partitionX + 1;
41            }
42        }
43        
44        throw new IllegalArgumentException("Input arrays are not sorted.");
45    }
46}
47