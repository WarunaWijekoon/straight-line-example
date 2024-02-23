import java.util.Arrays;

void main(){
    int[]nums={2,-8,3,4,-5,6,7,9};
    System.out.println(Arrays.toString(nums));
    insertionSort(nums);
    System.out.println(Arrays.toString(nums));
}
void insertionSort(int[]nums){
    int value=0;
    int valueIndex=0;
    for (int i = 0; i < nums.length-1; i++) {
        value = nums[i];
        valueIndex=i;

        for (int j = 0; j < nums.length-1; j++) {
        if (value==nums[j]){
            for (int k = 0; k < valueIndex; k++) {
                if (value<nums[j]){
                    nums[k]=nums[k+1];
                    nums[i]=value;}
            }



        }

}
        }
    }
