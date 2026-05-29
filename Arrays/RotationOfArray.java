public class RotationOfArray {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};

        System.out.println(search(nums, 0));
    }

    static int search(int[] nums, int target) {

        int pivot = pivot(nums);

        // array not rotated
        if (pivot == -1) {

            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // target is pivot
        if (nums[pivot] == target) {

            return pivot;
        }

        // search left side
        if (target >= nums[0]) {

            return binarySearch(nums, target, 0, pivot - 1);

        } else {

            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int pivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // case 1
            if (mid < end && nums[mid] > nums[mid + 1]) {

                return mid;
            }

            // case 2
            if (mid > start && nums[mid] < nums[mid - 1]) {

                return mid - 1;
            }

            // case 3
            if (nums[mid] <= nums[start]) {

                end = mid - 1;

            } else {

                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {

                start = mid + 1;

            } else if (target < nums[mid]) {

                end = mid - 1;

            } else {

                return mid;
            }
        }

        return -1;
    }
}