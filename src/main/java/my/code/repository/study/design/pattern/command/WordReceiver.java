package my.code.repository.study.design.pattern.command;

/**
 * @author djh on  2018/12/24 20:05
 * @E-Mail 1544579459@qq.com
 */
class WordReceiver {

    void cancel() {
        System.out.println("撤销操作!");
    }

    void stop() {
        System.out.println("中断操作");
    }

    void restore() {
        System.out.println("恢复操作");
    }
}
