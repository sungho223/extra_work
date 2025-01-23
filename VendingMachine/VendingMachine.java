package VendingMachine;

public class VendingMachine {
    Item item1;
    Item item2;
    Item item3;
    Item item4;

    public VendingMachine(Item item1, Item item2, Item item3, Item item4) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
    }

    public Item pressItemButton(String itemName, int orderCount) {
        if (itemName == this.item1.name) {
            if (this.item1.stock >= orderCount) {
                item1.stock -= orderCount;
                System.out.println(orderCount + "개 주문 완료: " + itemName);
                return new Item(item1.name, item1.price, orderCount);
            } else {
                System.out.println("상품이 품절되었습니다.");
                return null;
            }
        } else if (itemName == this.item2.name) {
            if (this.item2.stock >= orderCount) {
                item2.stock -= orderCount;
                System.out.println(orderCount + "개 주문 완료: " + itemName);
                return new Item(item2.name, item2.price, orderCount);
            } else {
                System.out.println("상품이 품절되었습니다.");
                return null;
            }
        } else if (itemName == this.item3.name) {
            if (this.item3.stock >= orderCount) {
                item2.stock -= orderCount;
                System.out.println(orderCount + "개 주문 완료: " + itemName);
                return new Item(item3.name, item3.price, orderCount);
            } else {
                System.out.println("상품이 품절되었습니다.");
                return null;
            }
        } else if (itemName == this.item4.name) {
            if (this.item4.stock >= orderCount) {
                item2.stock -= orderCount;
                System.out.println(orderCount + "개 주문 완료: " + itemName);
                return new Item(item4.name, item4.price, orderCount);
            } else {
                System.out.println("상품이 품절되었습니다.");
                return null;
            }
        }
        return null;
    }

    public void addItem(String itemName, int addCount) {
        if (itemName == this.item1.name) {
            item1.stock += addCount;
            System.out.println(addCount + "개 입고 완료: " + itemName);
        } else if (itemName == this.item2.name) {
            item2.stock += addCount;
            System.out.println(addCount + "개 입고 완료: " + itemName);
        } else if (itemName == this.item3.name) {
            item3.stock += addCount;
            System.out.println(addCount + "개 입고 완료: " + itemName);
        } else if (itemName == this.item4.name) {
            item4.stock += addCount;
            System.out.println(addCount + "개 입고 완료: " + itemName);
        }
    }

    public void printItems(Item item) {
        System.out.println("현재 재고 상태:");
        System.out.println("상품명: " + item.name + ", 가격: " + item.price + "원, 재고: " + item.stock + "개");
    }


}
