public class TestInvoice {
	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("01", "Samsung Galaxy A70 mobile phone", 1, 800.00);
		System.out.println(invoice1.toString());
		System.out.println("The total cost for Invoice 1 is: $" + invoice1.getTotal());
		invoice1.setUnitPrice(900.00);
		System.out.println("The total cost for Invoice 1 after updating the unitPrice is: $" + invoice1.getTotal());

		Invoice invoice2 = new Invoice(invoice1);
		System.out.println(invoice2.toString());
		invoice2.setQty(2);
		invoice2.setUnitPrice(899.99);
		System.out.println("Invoice 2 after updating the quantity and unit price is: " + invoice2.toString());
		System.out.println("The total cost for Invoice 2 is: $" + invoice2.getTotal());

		Invoice invoice3 = new Invoice("02", "Big box of fireworks", 4, 199.99);
		System.out.println(invoice3.toString());
		System.out.println("The total cost for Invoice 3 is: $" + invoice3.getTotal());

		Invoice invoice4 = new Invoice("03", "One way ticket to Paris France", 1, 1700.00);
		System.out.println(invoice4.toString());
		System.out.println("The total cost for Invoice 4 is: $" + invoice2.getTotal());

		Invoice invoice5 = new Invoice("04", "Lumber for building", 35, 10.00);
		System.out.println(invoice5.toString());
		System.out.println("The total cost for Invoice 5 is: $" + invoice2.getTotal());


		System.out.println("The total number of invoices that have been generated is: " + Invoice.invoiceCount);
	}
}
