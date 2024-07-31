import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mammal:1 , Shaktiman:2, Bird:3, Reptile:4");
        int type= sc.nextInt();
        Animal obj=null;
        if(type==1)
        {
            obj=new Mammal();

        }
        else if(type==2)
        {
            obj= new Shaktiman();

        }
        else if(type==3)
        {
           obj= new Bird();

        }
        else {
            obj = new Reptile();}
            obj.run();






    }
}