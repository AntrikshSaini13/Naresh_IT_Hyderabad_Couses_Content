package Mar_11_2024_ClassCode;

public class Question_9 {
    // HCF and GCD
    public static int greaterCommonFactor(int num1, int num2){
        int lowerNumber = (num1<num2 ? num1:num2);
        for(int i = lowerNumber; 0<i; i--){
            if(num1%i==0 && num2%i==0){
                System.out.println("Greast Common Factor is : "+i);
                return i;
            }            
        }
		return lowerNumber;
    }
    public static void main(String[] args) {
        System.out.println(Question_9.greaterCommonFactor(12,22));
    }
}
