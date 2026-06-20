public class EcommerceSearch {

    // Linear Search - checks each element one by one - O(n)
    public static int linearSearch(int[] productIds, int target) {
        for (int i = 0; i < productIds.length; i++) {
            if (productIds[i] == target) {
                return i; // found at index i
            }
        }
        return -1; // not found
    }

    // Binary Search - works only on SORTED array - O(log n) - much faster
    public static int binarySearch(int[] sortedProductIds, int target) {
        int low = 0;
        int high = sortedProductIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedProductIds[mid] == target) {
                return mid;
            } else if (sortedProductIds[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] productIds = {105, 203, 301, 450, 512, 670, 789};

        System.out.println("--- Linear Search ---");
        int result1 = linearSearch(productIds, 450);
        System.out.println("Product 450 found at index: " + result1);

        System.out.println("--- Binary Search (array must be sorted) ---");
        int result2 = binarySearch(productIds, 450);
        System.out.println("Product 450 found at index: " + result2);

        int result3 = binarySearch(productIds, 999);
        System.out.println("Product 999 found at index: " + result3 + " (-1 means not found)");
    }
}