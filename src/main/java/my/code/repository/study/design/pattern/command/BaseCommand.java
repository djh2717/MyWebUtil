package my.code.repository.study.design.pattern.command;

/**
 * @author djh on  2018/12/24 20:11
 * @E-Mail 1544579459@qq.com
 */
abstract class BaseCommand {
    WordReceiver mWordReceiver;

    BaseCommand(WordReceiver wordReceiver) {
        mWordReceiver = wordReceiver;
    }

    /**
     * Action.
     */
    abstract void execute();
}
