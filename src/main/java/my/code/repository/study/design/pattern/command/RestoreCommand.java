package my.code.repository.study.design.pattern.command;

/**
 * @author djh on  2018/12/24 20:13
 * @E-Mail 1544579459@qq.com
 */
class RestoreCommand extends BaseCommand {

    RestoreCommand(WordReceiver wordReceiver) {
        super(wordReceiver);
    }

    @Override
    void execute() {
        mWordReceiver.restore();
    }
}
