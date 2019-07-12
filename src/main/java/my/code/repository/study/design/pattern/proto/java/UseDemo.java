package my.code.repository.study.design.pattern.proto.java;

/**
 * Proto pattern: The key word is proto, when new a object is expensive, you should use
 * this pattern, and if you need copy protection, also can use this.
 * Notice: You often should use deep clone to avoid error!
 *
 * @author djh on  2018/11/28 16:47
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        WordDocument wordDocument = new WordDocument();
        wordDocument.setText("文档一");
        wordDocument.addImage("Image-1");
        wordDocument.addImage("Image-2");
        wordDocument.addImage("Image-3");

        wordDocument.showDocument();

        WordDocument cloneDocument = wordDocument.clone();
        cloneDocument.setText("克隆文档");
        cloneDocument.addImage("哈哈哈.jpg");

        cloneDocument.showDocument();
        wordDocument.showDocument();
    }
}
