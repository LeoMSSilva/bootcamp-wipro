package ProgrammingChallenge;

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ids = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] names = { "Milk", "Cereal", "Rice", "Tuna", "Beans", "Sardine", "Oil", "Soap", "Salt", "Sugar" };
//		String[] names = { "Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Óleo", "Sabão", "Sal", "Açucar" };
		int[] quantities = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		float[] prices = { 4.57f, 3.02f, 9.43f, 3.55f, 6.55f, 4.55f, 7.33f, 1.99f, 3.82f, 4.29f };
		int[] cart = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double tax = 0.09, discount = 0, total = 0;
		int id = 0, quantity = 0;
		String answer = "s";
		String divider = "\n===================================================================================\n";

		do {
			// purchases
			do {
				System.out.printf("\n\t\t\t\tWIPRO STORE%sCODE\t\tPRODUCT\t\t\tQUANTITY\tUNIT PRICE\n", divider);
				for (int i = 0; i < ids.length; i++) {
					System.out.printf("%d\t\t%s\t\t\t%d\t\t$ %.2f\n", ids[i], names[i], quantities[i], prices[i]);
				}

				System.out.printf("%sEnter the product code: ", divider);
				id = scanner.nextInt();

				while (!(id > 0 && id <= ids.length)) {
					System.err.println("\nInvalid code!");
					System.out.print("Enter the quantity of the product: ");
					id = scanner.nextInt();
				}

				if (quantities[id - 1] == 0) {
					System.err.println("\nSorry, this product is out of stock!");
					continue;
				}

				System.out.print("Enter the quantity of the product: ");
				quantity = scanner.nextInt();

				while (!(quantity > 0 && quantity <= ids.length)) {
					System.err.print("\nInvalid quantity!\n");
					System.out.print("Enter the quantity of the product: ");
					quantity = scanner.nextInt();
				}

				while (quantities[id - 1] < quantity) {
					System.err.println("\nSorry, we don't have that many " + names[id - 1] + " in stock!");
					System.out.print("Enter the quantity of the product: ");
					quantity = scanner.nextInt();
				}

				System.out.println("\n" + quantity + " unit of " + names[id - 1] + " successfully added to cart!");
				quantities[id - 1] = quantities[id - 1] - quantity;
				cart[id - 1] = cart[id - 1] + quantity;

				System.out.print("\nWant answer by buying? [Y/N]:");
				answer = scanner.next();
				while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
					System.err.println("Invalid command!");
					System.out.print("Want answer by buying? [Y/N]:");
					answer = scanner.next();
				}

			} while (!answer.equalsIgnoreCase("n"));

			// purchased items

			System.out.printf("%sProduct\t\tQuantity\tUnit price ($)\tTotal Price ($)\n", divider);
			for (int i = 0; i < cart.length; i++) {
				if (cart[i] > 0) {
					System.out.printf("%s\t\t%d\t\t\t$ %.2f\t\t$ %.2f\n", names[i], cart[i], prices[i],
							(prices[i] * cart[i]));
					total += (prices[i] * cart[i]);
				}
			}
			System.out.printf("%sThe total purchase price with tax of 9%%: $ %.2f %s", divider, total, divider);

			// form of payment

			System.out.print(
					"\nPayment options...\n[1]In cash or MASTERCARD card, you receive a 20% discount.\n[2]In cash on your credit card, you receive a 10% discount.\n[3]Twice, normal interest-free sticker price.\n[4]In three installments, regular sticker price plus 10% interest.\n\nWhat would be the payment method? ");
			int formaPagamento = scanner.nextInt();

			do {
				if (formaPagamento == 1) {
					discount = total * 0.2;
					total -= discount;
				} else if (formaPagamento == 2) {
					discount = total * 0.1;
					total -= discount;
				} else if (formaPagamento == 3) {
					break;
				} else if (formaPagamento == 4) {
					total += total * 0.1;
				} else {
					System.err.print("Invalid command!\n");
					System.out.print("\nWhat would be the payment method? ");
					formaPagamento = scanner.nextInt();
				}
			} while (!(formaPagamento > 0 && formaPagamento < 5));

			// invoice

			System.out.printf(
					"\n\nWIPRO STORE\nDevelopers Street, nº0 - Market - LTDA\nCNPJ: 1234554321-00\n\t\t\t\tInvoice%s\nPRODUCT\t\tQUANTITY OF PRODUCTS\t\tUnit PRICE\t\tTOTAL PRICE\n\n",
					divider);
			for (int i = 0; i < quantities.length; i++) {
				if (cart[i] == 0) {
					continue;
				}
				System.out.printf("%s\t\t\t%d\t\t\t$ %.2f\t\t\t$ %.2f\n", names[i], cart[i], prices[i],
						prices[i] * cart[i]);
			}

			System.out.printf(
					"%s\nDiscounted value:\t\t$ %.2f\nTotal amount to be paid:\t$ %.2f\nTax amount:\t\t\t$ %.2f\n",
					divider, discount, total, total * tax);

			// new purchase

			System.out.printf("\n\n\n%sDo you want to make a new purchase? [Y/N]:", divider);
			answer = scanner.next();

			while (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))) {
				System.err.println("Invalid command!");
				System.out.print("\nDo you want to make a new purchase? [Y/N]:");
				answer = scanner.next();
			}
		} while (!answer.equalsIgnoreCase("n"));

		scanner.close();
		System.out.println("\nWe appreciate your presence!\nCheck back often!");
	}
}
