public class Bird extends Animal implements Iflyable, SpreadWings {
    @Override
    public void fly()
    {
        System.out.println("Bird can fly");
    }

    @Override
    void run(){
       System.out.println("Can run fast also I am tiny");
    }


    @Override
    public void spredWing()
    {
        System.out.println("Can SpreadWINGS");
    }
}
