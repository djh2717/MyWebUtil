package my.code.repository.study.design.pattern.chain.java;

/**
 * @author djh on  2018/9/16 20:23
 * @E-Mail 1544579459@qq.com
 */
class ConcreteHandlerB extends AbstractHandler {


    @Override
    void handlerRequest(int money) {
        if (money >= 30 && money < 50) {
            System.out.println("可以买宝马5系,买车成功!");
        } else {
            mNextHandler.handlerRequest(money);
        }
    }
}
