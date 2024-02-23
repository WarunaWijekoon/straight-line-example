void main(){
   // printDigit(100);
   printDigit(822333);
}
void printDigit(int number) {
    System.out.println(number);

    for (int i = 0; number != 0; i++) {
        int number1 = number % 10;


//        System.out.print(STR."\{number1},");

        for (int j = 0; j < i; j++) {

//            int[i]numbers= new int[]{number};

        }

        number=(number-number1)/10;

    }

}

