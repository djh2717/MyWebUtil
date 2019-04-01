package my.code.repository.study.design.pattern.command;

/**
 * @author djh on  2018/12/24 20:19
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        WordReceiver wordReceiver = new WordReceiver();

        RestoreCommand restoreCommand = new RestoreCommand(wordReceiver);
        StopCommand stopCommand = new StopCommand(wordReceiver);
        CancelCommand cancelCommand = new CancelCommand(wordReceiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(restoreCommand);
        invoker.action();

        invoker.setCommand(stopCommand);
        invoker.action();

        invoker.setCommand(cancelCommand);
        invoker.action();
    }
}
