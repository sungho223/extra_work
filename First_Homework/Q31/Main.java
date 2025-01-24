package First_Homework.Q31;

public class Main {
    public static void main(String[] args) {
        Stock stock1 = new Stock("macbook", 1000000, 10);
        Stock stock2 = new Stock("iPhone", 500000, 20);
        Stock stock3 = new Stock("apple watch", 300000, 5);
        Stock stock4 = new Stock("iMac", 700000, 2);

        Seller seller = new Seller(0, stock1, stock2, stock3, stock4);
        Buyer buyer = new Buyer(5000000); // 구매자의 초기 자산

        // 정상적인 구매
        System.out.println("== 정상적인 구매 예제 ==");
        buyer.buyFromSeller(seller, "macbook", 6); // macbook 4개 구매
        System.out.println();

        // 구매 수량이 물품 수량보다 많을 때 예제
        System.out.println("== 구매 수량이 물품 수량보다 많을 때 예제 ==");
        buyer.buyFromSeller(seller, "iMac", 3); // iMac 3개 구매
        System.out.println();

        // 구매자 상태 출력
        buyer.printNow();
        System.out.println();

        // 판매자 상태 출력
        seller.showInfo();
        System.out.println();

        // 재고 현황 출력
        seller.showAllStock();
    }
}

// == 정상적인 구매 예제 ==
// 잔액이 부족합니다. 구매를 취소합니다.

// == 구매 수량이 물품 수량보다 많을 때 예제 ==
// iMac 2개 판매 
// 총 금액: 1400000

// 구매한 상품 수: 2
// 지갑 현황: 3600000

// 판매자가 번 상품 가격: 1400000원
// 판매자의 금고 현황: 1400000원

// 물품 보유 현황
// macbook 재고 현황 : 10
// iPhone 재고 현황 : 20
// apple watch 재고 현황 : 5
// iMac 재고 현황 : 0