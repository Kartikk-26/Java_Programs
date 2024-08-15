class animal{
    void eat(){
        System.out.println("Dog is Eating....");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dog is Barking.....");
    }
}
class babydog extends dog{
    void weep(){
        System.out.println("Dog is Weeping....");
    }
}

public class inheritance {
    public static void main(String args[])
    {
        babydog d=new babydog();
        d.weep();
        d.bark();
        d.eat();
    }
}
