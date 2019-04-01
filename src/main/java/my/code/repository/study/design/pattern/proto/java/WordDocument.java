package my.code.repository.study.design.pattern.proto.java;

import java.util.ArrayList;

/**
 * @author djh on  2018/11/28 16:40
 * @E-Mail 1544579459@qq.com
 */
public class WordDocument implements Cloneable {

    private String text;
    private ArrayList<String> imageList = new ArrayList<>();

    public WordDocument() {
        System.out.println("--------WordDocument的构造方法--------");
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        WordDocument cloneDocument = (WordDocument) super.clone();
        if (cloneDocument != null) {
            cloneDocument.text = text;
            cloneDocument.imageList = (ArrayList<String>) this.imageList.clone();
            return cloneDocument;
        }
        return null;
    }

    public void showDocument() {
        System.out.println("--------DocumentStart--------");
        System.out.println("Text: " + text);
        for (String s : imageList) {
            System.out.println("Image: " + s);
        }
        System.out.println("--------DocumentEnd--------");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addImage(String image) {
        imageList.add(image);
    }
}
