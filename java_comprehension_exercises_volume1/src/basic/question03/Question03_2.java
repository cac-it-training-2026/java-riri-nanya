package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		int basePrice = 1200;
		int ticket = 3;
		int reducedPrice = (basePrice - 200);
		int readucedTickets = ticket;
		readucedTickets = readucedTickets--;
		int totalPrice = reducedPrice * readucedTickets;
		double taxRate = 1.1;
		int totalWithTax = (int) (totalPrice * taxRate);

		System.out.println("購入可能枚数は" + readucedTickets + "枚です。");
		System.out.println("値下げごの１枚あたりの料金は" + reducedPrice + "円です。");
		System.out.println("合計金額（税抜）は " + totalPrice + "です。");
		System.out.println("合計金額（税抜）は " + totalWithTax + "です。");

	}
}
