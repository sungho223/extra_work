package First_Homework.Q30;

public class Buyer {
    private int wallet;  // 구매자의 자산(잔액)
    private int cart;    // 구매한 상품 수량

    public Buyer(int wallet) {
        this.wallet = wallet;
        this.cart = 0;  // 초기 장바구니는 0개
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getCart() {
        return cart;
    }

    public void setCart(int cart) {
        this.cart = cart;
    }

    public void buyFromSeller(Seller seller, String stockName, int quantity) {
        // 상품 판매 메소드 호출
        int boughtQuantity = seller.sellStock(this, stockName, quantity);

        if (boughtQuantity > 0) {
            cart += boughtQuantity;  // 구매한 상품 수량만큼 장바구니에 추가
        }
    }

    public void printNow() {
        System.out.println("구매한 상품 수: " + cart);
        System.out.println("지갑 현황: " + wallet);
    }
}