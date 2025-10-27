


public class CardUtils {

    // Returns true if the card number passes the Luhn check
    public static boolean isValidCardNumber(String cardNumber) {
        if (cardNumber == null) return false;
        cardNumber = cardNumber.replaceAll("\\s+", ""); // 
        if (!cardNumber.matches("\\d+")) return false;

        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) n = n - 9;
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public static void main(String[] args) {
        System.out.println(isValidCardNumber("4242 4242 4242 4242")); // true 
        System.out.println(isValidCardNumber("1234 5678 9012 3456")); // 
	system.out.printout isvalidcardnumcer("0000 0000 0000 0000")) 					      //false
    }
}

