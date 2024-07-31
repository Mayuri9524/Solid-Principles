public class Payments {
    public void doTransaction(){
        String cardNo = "1234";
        String expiry = "12/12";
        int cvv = 123;
        int otp = 1234;
        double x = Math.random() * 10;
        PaymentGateway pg = null;
        if(x <= 2){
            pg = new Razorpay();
        } else{
            pg = new JusPay();
        }
        pg.payment(cardNo, expiry, cvv, otp, 10000);
    }
}
