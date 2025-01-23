package First_Homework.Cat;

/**
 * 문제 28번
 */
public class Cat {
    String catName;
    String caType;
    String catSize;

    public Cat(String catName, String caType, String catSize) {
        this.catName = catName;
        this.caType = caType;
        this.catSize = catSize;
    }

    public void selfIntroduce() {
        System.out.println("안녕 내 이름은 " + this.catName + "라고 불러줘");
        System.out.println("나는 " + this.caType + "종이고, 크기는 " + this.catSize + "라고 하더라고");
    }

    public void cry() {
        if (caType.equals("대형")) {
            System.out.println(this.catName + "가 크아아앙 하고 울고 있습니다!");
        } else if (caType.equals("중형")) {
            System.out.println(this.catName + "가 요드룡요들룡룡 하고 울고 있습니다!");
        } else {
            System.out.println(this.catName + "가 우와와앙아 하고 울고 있습니다!");
        }
    }

}
