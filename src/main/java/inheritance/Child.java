package main.java.inheritance;

public class Child extends Parent{
//
//    String name = "홍길동";
//    int age = 40;
//

    public static void main(String[] args) {
        Child child = new Child();
        child.부모님_정보();
    }

    public void 부모님_정보() {
        System.out.println(
                "이름 : " + this.name + "\n" +
                "나이 : " + this.age
        );
    }
}
