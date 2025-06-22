public class Main {
    public static void main(String[] args) {
        // Using Stripe via adapter
        PaymentProcessor stripePayment = new StripeAdapter(new StripeGateway());
        stripePayment.processPayment(1000.0);

        // Using PayPal via adapter
        PaymentProcessor paypalPayment = new PayPalAdapter(new PayPalGateway());
        paypalPayment.processPayment(2000.0);
    }
}
