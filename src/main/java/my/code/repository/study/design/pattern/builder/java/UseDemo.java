package my.code.repository.study.design.pattern.builder.java;

/**
 * Builder design mode, when the object is complex, need a lot of construct method
 * you can use this to simple construct a complex object.
 *
 * @author Djh on 2018/7/27 15:36
 * E-Mail ：1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        ComplexObject.Builder builder = new ComplexObject.Builder();
        ComplexObject complexObject = builder.setAge(22)
                .setFatherName("djh")
                .setSex("boy")
                .setName("djl")
                .build();
    }
}
