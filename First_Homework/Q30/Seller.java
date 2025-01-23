package First_Homework.Q30;

public class Seller {
    String stockName;
    int stockPrice;
    int stockInventory;
    int sellerBank;


    public Seller(String stockName, int stockPrice, int stockInventory, int sellerBank){
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockInventory = stockInventory;
        this.sellerBank = sellerBank;
    }

    public int sell(int quantity, Buyer buyer){
        if(stockInventory==0){
            System.out.println("재고가 없습니다.");
            return 0;
        }

        int maxPossible = Math.min(stockInventory,quantity);
        int totalCost = maxPossible * stockPrice;
        if(buyer.getWallet()<totalCost){
            System.out.println("손님, 계좌 확인해주세요.");
            return 0;
        }

        stockInventory -=maxPossible;
        sellerBank += totalCost;
        buyer.minusWallet(totalCost);
        buyer.addCart(maxPossible);

        return maxPossible;

    }

    public void printStatus() {
        System.out.println("판매자의 상품 수: " + stockInventory + "개");
        System.out.println("판매자의 상품 가격: " + stockPrice + "원");
        System.out.println("판매자의 금고 현황: " + sellerBank + "원");
    }
}

