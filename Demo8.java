import java.util.Scanner;

void main(){
    int[]nums={50,20,3,-2,7,8};
    final var SCANNER =new Scanner(System.in);
    outer:
    do {
        System.out.print("Enter a number to search:");
        int input=SCANNER.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==input){
                System.out.println(STR."found:\{i}");
                continue outer;
            }
        }
        System.out.println("not found");

    }while (true);
    }
