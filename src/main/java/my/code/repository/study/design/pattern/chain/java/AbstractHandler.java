package my.code.repository.study.design.pattern.chain.java;

/**
 * @author djh on  2018/9/16 20:22
 * @E-Mail 1544579459@qq.com
 */
abstract class AbstractHandler {

    AbstractHandler mNextHandler;

    /**
     * Handler the request.
     *
     * @param money the request para.
     */
    abstract void handlerRequest(int money);
}
