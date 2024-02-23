void main(){
    System.out.println(divide(7,2));
}
int divide(int num1,int num2){
    int sum=0;
    for (int i = 0; i <10 ; i++) {

        if(num1-num2>=num2){
            sum=sum+1;
            num1=num1-num2;
        }
        return sum;
    }
return sum;
}