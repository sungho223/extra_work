package First_Homework.Q30;

public class Buyer {
    int wallet;
    int cart;

    public Buyer(int wallet) {
        this.wallet = wallet;
        this.cart = 0;
    }

    public void buy(Seller seller, int quantity){
        System.out.println("구매자가 " + quantity + "개의 물건을 구입하려고 합니다");
        int finalCart = seller.sell(quantity, this);
        if(finalCart>0){
            System.out.println(finalCart  + "개 상품 구입완료");
        }else {
            System.out.println("구매 실패");
        }
    } 

    public void minusWallet(int amount){
        wallet -= amount;
    }

    public void addCart(int quantity){
        cart += quantity;
    }

    public int getWallet(){
        return wallet;
    }

    public void printNow(){
        System.out.println("상품 수: " + cart );
        System.out.println("지갑 현황: " + wallet);
    }
}


