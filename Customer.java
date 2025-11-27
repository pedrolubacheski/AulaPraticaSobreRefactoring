import java.util.Enumeration;
import java.util.Vector;

public class Customer {
   private String _name;
   private Vector _rentals = new Vector();

   public Customer(String name) {
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.addElement(arg);
   }

   public String getName() {
      return _name;
   }

public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    Enumeration rentals = _rentals.elements();
    String result = "Rental Record for " + getName() + "\n";

    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();

        frequentRenterPoints += each.getFrequentRenterPoints();

        result += "\t" + each.getMovie().getTitle() + "\t" +
                each.getCharge() + "\n";

        totalAmount += each.getCharge();
    }

    result += "Amount owed is " + totalAmount + "\n";
    result += "You earned " + frequentRenterPoints + " frequent renter points";
    return result;
}


    private double getTotalCharge() {
    double result = 0;
    Enumeration rentals = _rentals.elements();
    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        result += each.getCharge();
    }
    return result;
}

    private int getTotalFrequentRenterPoints() {
    int result = 0;
    Enumeration rentals = _rentals.elements();
    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        result += each.getFrequentRenterPoints();
    }
    return result;
}



      // add footer lines
      result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
      result += "You earned " + String.valueOf(frequentRenterPoints) +
               " frequent renter points";
      return result;
   }

public String htmlStatement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    Enumeration rentals = _rentals.elements();
    String result = "<h1>Rental Record for <em>" + getName() + "</em></h1><p>\n";

    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();

        // soma pontos
        frequentRenterPoints += each.getFrequentRenterPoints();

        // adiciona valor
        result += each.getMovie().getTitle() + ": " +
                each.getCharge() + "<br>\n";

        totalAmount += each.getCharge();
    }

    result += "<p>Amount owed is <em>" + totalAmount + "</em><p>\n";
    result += "You earned <em>" + frequentRenterPoints +
            "</em> frequent renter points<p>\n";

    return result;
}


