package my.code.repository.study.design.pattern.template;

/**
 * @author djh on  2019/1/3 16:30
 * @E-Mail 1544579459@qq.com
 */
public abstract class BaseFry {

    void cookProcess() {
        this.addOil();
        this.addFood();
        this.addSeasoning();
        this.putFood();
    }

    void addOil() {
        System.out.println("加入食用油!");
    }

    abstract void addFood();

    abstract void addSeasoning();

    void putFood() {
        System.out.println("装盘!");
    }
}
