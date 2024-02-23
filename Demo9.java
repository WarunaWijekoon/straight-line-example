import java.util.Arrays;

void main(){
    int[]nums1={3,2,5,-3,10,8};
    int[]nums2={3,2,5,-3,10,8};

    System.out.println(Arrays.toString(nums1));
    selectionSortViaMin(nums1);
    System.out.println(Arrays.toString(nums1));
    System.out.println("-------------------------------------------------");
    System.out.println(Arrays.toString(nums2));
    selectionSortViaMax(nums2);
    System.out.println(Arrays.toString(nums2));
}
void selectionSortViaMin(int[]nums) {



    for (int i = 0; i < nums.length; i++) { int minindex = i;

        int min = nums[minindex];


        for (int j = 1 + i; j< nums.length ; j++) {

            if (nums[j] < min) {
                minindex = j;
                min = nums[j];
            }

        }
        if (minindex==i)continue;
        int temp = nums[i];
        nums[i] = min;
        nums[minindex]=temp;
    }

}
void selectionSortViaMax(int[]nums) {



    for (int i = nums.length-1; i >= 0; --i) { int maxindex = i;

        int max = nums[maxindex];


        for (int j = i-1; j >=0; --j) {

            if (nums[j] < max) {
                maxindex = j;
                max = nums[j];
            }

        }
        if (maxindex==i)continue;
        int temp = nums[i];
        nums[i] = max;
        nums[maxindex]=temp;
    }

}