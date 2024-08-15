class grandfather{
    void G(){
        System.out.println("he is grandfather");
    }
}
class father extends grandfather{
    void F(){
        System.out.println("he is father");
    }
}
class son extends father{
    void S(){
        System.out.println("he is son");
    }
}
class daughter extends father{
    void D(){
        System.out.println("she is daughter");
    }
}

public class hybrid {
    public static void main(String args[]){
        son ADITYA=new son();
        ADITYA.S();
        ADITYA.F();
        ADITYA.G();
        daughter Angha=new daughter();
        Angha.D();
        Angha.F();
        Angha.G();
    }
}

class{
    pubic static void main(String{}args){
        son ADITYA=new son();
        kartik = new grandfather();
        anjali = mew daughter();
        
    }
}