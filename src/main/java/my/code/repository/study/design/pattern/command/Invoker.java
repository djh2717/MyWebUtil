package my.code.repository.study.design.pattern.command;

/**
 * @author djh on  2018/12/24 20:17
 * @E-Mail 1544579459@qq.com
 */
class Invoker {

    private BaseCommand mBaseCommand;

    void setCommand(BaseCommand baseCommand) {
        mBaseCommand = baseCommand;
    }

    void action() {
        mBaseCommand.execute();
    }
}
