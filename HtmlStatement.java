public class HtmlStatement extends Statement {

    @Override
    protected String headerString(Customer customer) {
        return "<h1>Rental Record for <em>" + customer.getName() + "</em></h1><p>\n";
    }

    @Override
    protected String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " +
               rental.getCharge() + "<br>\n";
    }

    @Override
    protected String footerString(Customer customer) {
        return "<p>Amount owed is <em>" + customer.getTotalCharge() + "</em><p>\n" +
               "You earned <em>" + customer.getTotalFrequentRenterPoints() +
               "</em> frequent renter points<p>\n";
    }
}
