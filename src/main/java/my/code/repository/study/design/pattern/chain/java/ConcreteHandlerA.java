package my.code.repository.study.design.pattern.chain.java;

/**
 * @author djh on  2018/9/16 20:23
 * @E-Mail 1544579459@qq.com
 */
class ConcreteHandlerA extends AbstractHandler {

    @Override
    void handlerRequest(int money) {
        if (money < 30) {
            System.out.println("少于30万,可以买宝马2系,买车成功!");
        } else {
            mNextHandler.handlerRequest(money);
        }
    }
}
