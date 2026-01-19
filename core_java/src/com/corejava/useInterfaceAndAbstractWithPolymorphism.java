package core_java.src.com.corejava;

/*
 ===============================
 Interface → WHAT to do
 ===============================
 Payment interface sirf rule define karta hai
 ki payment method hona hi chahiye.
 Implementation ka logic yahan nahi hota.
*/
interface Payment {
    void payment(int amount);
}

/*
 ===============================
 CardPayment → HOW to do
 ===============================
 Payment interface ko implement karta hai.
 Card se payment ka logic yahan likha gaya hai.
*/
class CardPayment implements Payment {

    // Method overriding
    // Interface ke method ko implement karna compulsory hai
    public void payment(int amount) {
        System.out.println("Payment through card: " + amount);
    }
}

/*
 ===============================
 UpiPayment implementation
 ===============================
 Alag class, alag logic
 Par method same — polymorphism ka base
*/
class UpiPayment implements Payment {

    // Method overriding
    public void payment(int amount) {
        System.out.println("Payment through Upi: " + amount);
    }
}

/*
 ===============================
 BankPayment implementation
 ===============================
*/
class BankPayment implements Payment {

    // Method overriding
    public void payment(int amount) {
        System.out.println("Payment through bank: " + amount);
    }
}

/*
 =====================================================
 Main class
 =====================================================
 Yahan hum polymorphism use kar rahe hain
 Parent reference → child object
*/
public class useInterfaceAndAbstractWithPolymorphism {

    public static void main(String[] args) {

        /*
         Payment is interface (parent)
         p is reference variable

         Ek hi reference se alag-alag
         payment methods call ho rahe hain
         → this is Runtime Polymorphism
        */
        Payment p;

        // CardPayment object
        p = new CardPayment();
        p.payment(500);

        // UpiPayment object
        p = new UpiPayment();
        p.payment(5000);

        // BankPayment object
        p = new BankPayment();
        p.payment(10000);
    }
}
