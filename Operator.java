public class Operator {
    public static void main(String[]args){
        Integer number =5;
        boolean res;

        if(res=number instanceof Integer){
            System.out.println("Number is an object of Integer. Hence: " + res);
        }
        else{
            System.out.println("Number is not the object of Integer. Hence:  " + res);
        }
    }
    
}
