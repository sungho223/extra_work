package First_Homework.Cat;

// Cat 클래스를 만들어보세요

// 속성
// 이름
// 종류 (코리안 숏헤어, 노르웨이 숲, 메인쿤, 렉돌 등등)
// 크기 (대형, 중형, 소형 등등)
// 기능
// 생성자
// 소개하기
// 울기
public class Cat {
    private String catName;
    private String caType;
    private String catSize;

    public Cat(String catName, String caType, String catSize) {
        this.catName = catName;
        this.caType = caType;
        this.catSize = catSize;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCaType() {
        return caType;
    }

    public void setCaType(String caType) {
        this.caType = caType;
    }

    public String getCatSize() {
        return catSize;
    }

    public void setCatSize(String catSize) {
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
