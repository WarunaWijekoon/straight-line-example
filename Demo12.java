import java.util.Arrays;

void main(){
 int[]nums={6,4,9,8,-2,3,8,0};
System.out.println(Arrays.toString(nums));
  mergeSort(nums);
//System.out.println(Arrays.toString(nums));
}
void mergeSort(int[]nums){
    sort(nums,0,nums.length);
}
void sort(int[]nums,int start,int end) {
    int arryLength = nums.length / 2;
    int[] array1 = new int[0];
    array1 = new int[arryLength];
    for (int i = 0; i < arryLength; i++) {
       // System.out.print(nums[i]);

        array1[i] = nums[i];
    }
    int[] array2 = new int[0];
    array2 = new int[array1.length];
    for (int j = 0; j < array2.length; j++) {
        // System.out.print(nums[i]);

        array2[j] = nums[j+array1.length];
    }

//
System.out.println(Arrays.toString(array1));
//   System.out.println(Arrays.toString(array2));
    if (array1.length==2)return;
    mergeSort(array1);

}