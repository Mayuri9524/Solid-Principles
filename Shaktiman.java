public class Shaktiman extends Animal implements Iflyable{
    @Override
    void run(){
        System.out.println("Can run");
    }

    @Override
    public void fly(){
        System.out.println("Can fly");
    }
}
