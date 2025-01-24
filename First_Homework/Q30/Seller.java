package First_Homework.Q30;

public class Seller {

    private int sellerBalance = 0; // 판매자 금고 현황
    private int soldItemsCount = 0; // 판매된 상품 수
    private int soldAmount = 0; // 판매된 상품의 총 금액
    Stock stock1;
    Stock stock2;
    Stock stock3;
    Stock stock4;

    public Seller(int sellerBalance, Stock stock1, Stock stock2, Stock stock3, Stock stock4) {
        this.sellerBalance = sellerBalance;
        this.stock1 = stock1;
        this.stock2 = stock2;
        this.stock3 = stock3;
        this.stock4 = stock4;
    }

    public int getSellerBalance() {
        return this.sellerBalance;
    }

    public int getSoldItemsCount() {
        return soldItemsCount;
    }

    public int getSoldAmount() {
        return soldAmount;
    }

    // 상품 판매 메소드
    public int sellStock(Buyer buyer, String stockName, int quantity) {
        Stock stock = findStock(stockName);

        if (stock == null) {
            System.out.println(stockName + " 상품이 없습니다.");
            return 0;
        }

        // 재고가 없는 경우
        if (stock.getStockCurrent() == 0) {
            System.out.println(stockName + " 재고가 없습니다.");
            return 0;
        }

        // 구매자가 요청한 수량이 재고보다 많으면, 남은 재고만큼 판매
        int maxBuy = Math.min(quantity, stock.getStockCurrent());
        int totalCost = maxBuy * stock.getStockPrice(); // 총 금액 계산

        // 구매자가 충분한 금액을 가지고 있는지 확인
        if (buyer.getWallet() < totalCost) {
            System.out.println("잔액이 부족합니다. 구매를 취소합니다.");
            return 0;
        }

        // 금액 차감 및 재고 차감
        buyer.setWallet(buyer.getWallet() - totalCost); // 구매자의 지갑에서 차감
        this.soldItemsCount += maxBuy;  // 판매된 수량 증가
        this.soldAmount += totalCost;   // 판매된 금액 증가

        stock.setStockCurrent(stock.getStockCurrent() - maxBuy); // 재고 차감
        this.sellerBalance += totalCost; // 판매 금액을 금고에 추가

        System.out.println(stockName + " " + maxBuy + "개 판매 \n총 금액: " + totalCost);
        return maxBuy;  // 판매된 수량만 반환
    }

    Stock findStock(String stockName) {
        if (stock1.getStockName().equals(stockName)) return stock1;
        if (stock2.getStockName().equals(stockName)) return stock2;
        if (stock3.getStockName().equals(stockName)) return stock3;
        if (stock4.getStockName().equals(stockName)) return stock4;
        return null;
    }

    public void showAllStock() {
        System.out.println("물품 보유 현황");
        System.out.println(stock1.getStockName() + " 재고 현황 : " + stock1.getStockCurrent());
        System.out.println(stock2.getStockName() + " 재고 현황 : " + stock2.getStockCurrent());
        System.out.println(stock3.getStockName() + " 재고 현황 : " + stock3.getStockCurrent());
        System.out.println(stock4.getStockName() + " 재고 현황 : " + stock4.getStockCurrent());
    }

    public void showInfo() {
        System.out.println("판매자가 번 상품 가격: " + soldAmount + "원");
        System.out.println("판매자의 금고 현황: " + this.sellerBalance + "원");
    }
}