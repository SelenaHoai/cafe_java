public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 4;
        double lattePrice = 3;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        // what to do if condition is true
        } else {
            System.out.println(customer4 + pendingMessage); // Displays "Noah, your order will be ready shortly"
        }
        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Sam"
        System.out.println(displayTotalMessage + (lattePrice + lattePrice));
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage); // Displays "Sam, your order is ready"
        // what to do if condition is true
        } else {
            System.out.println(customer2 + pendingMessage); 
        }
        System.out.println(displayTotalMessage + (dripPrice - lattePrice)); // Displays "Your total is $-0.5"

        // continue with program

    }
}
