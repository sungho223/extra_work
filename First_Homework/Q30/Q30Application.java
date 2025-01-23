package First_Homework.Q30;

public class Q30Application {
    public static void main(String[] args) {
        Seller seller = new Seller("맥북", 2_000_000, 300, 100000); // 재고 10개, 상품 가격 3000원, 금고 100000원
        Buyer buyer = new Buyer(5_000_000); // 지갑에 8000원

        // 초기 상태 출력
        System.out.println("거래 전 상태:");
        seller.printStatus();
        buyer.printNow();

        System.out.println();

        // 거래 시도
        buyer.buy(seller, 1); // 구매자가 3개의 상품 구매 시도

        System.out.println();

        // 거래 후 상태 출력
        System.out.println("거래 후 상태:");
        seller.printStatus();
        buyer.printNow();
    }
}
