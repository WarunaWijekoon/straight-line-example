import java.util.Scanner;

void main(){
    int[]nums ={5,4,-5,4,3,2};
    final var SCANNER =new Scanner(System.in);
    do {
        System.out.println("Enter a number to search");
        int input=SCANNER.nextInt();
        int fountAt =binarySearch(nums,0,nums.length-1,input);
        if (fountAt!=-1) System.out.println(STR."fond at\{fountAt}");
        else System.out.println("not found");
        for (int i = nums.length-1; i >=0 ; i--) {
           System.out.print(nums[i]);

        }
    }while (true);
}
int binarySearch(int[]nums,int head,int tail,int target) {
    if (nums[head] == target) return head;
    if (nums[tail] == target) return tail;
    int middle = (head + tail) / 2;
    if (nums[middle] == target) return middle;
    if (nums[middle]>target){return binarySearch(nums,head+1,middle+1,target);
    }else {}

    return 0;}