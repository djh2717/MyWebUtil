package my.code.repository.study.design.pattern.chain.java;

/**
 * 责任链模式: 关键字 "链".
 * <p>
 * 该模式主要通过 "链" 的方式来连接多个的对象, 当初始对象发送事件请求时, 从链的首部对象开始处理
 * 该请求, 如果处理失败者传递给下一个请求者, 以此类推.
 *
 * @author djh on  2018/9/16 20:23
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {

    public static void main(String[] args) {

        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        ConcreteHandlerC concreteHandlerC = new ConcreteHandlerC();

        concreteHandlerA.mNextHandler = concreteHandlerB;
        concreteHandlerB.mNextHandler = concreteHandlerC;

        concreteHandlerA.handlerRequest(20);
    }
}