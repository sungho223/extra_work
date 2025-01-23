package VendingMachine;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("박카스", 900, 15);
        Item item2 = new Item("몬스터", 1500, 20);
        Item item3 = new Item("핫식스", 1300, 10);
        Item item4 = new Item("밀키스", 1400, 5);

        VendingMachine vendingMachine = new VendingMachine(item1, item2, item3, item4);

        vendingMachine.printItems(item1);
        vendingMachine.printItems(item2);
        vendingMachine.printItems(item3);
        vendingMachine.printItems(item4);

        // 주문 테스트
        vendingMachine.pressItemButton("몬스터", 5);
        vendingMachine.pressItemButton("밀키스", 6); // 재고 부족

        // 입고 테스트
        vendingMachine.addItem("밀키스", 10);
        vendingMachine.addItem("콜라", 5); // 존재하지 않는 상품

        vendingMachine.printItems(item1);
        vendingMachine.printItems(item2);
        vendingMachine.printItems(item3);
        vendingMachine.printItems(item4);

    }
}
