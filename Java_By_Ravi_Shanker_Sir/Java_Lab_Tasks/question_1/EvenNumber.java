// BLC

public class EvenNumber{
    public static int getEvenNumber(int num) {
        int i ;
        for(i=1;i<=num;i++){
            if(i%2==0){
                return i;
            }
        }
        return 0;
    }
}