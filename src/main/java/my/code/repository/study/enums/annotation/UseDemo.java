package my.code.repository.study.enums.annotation;

/**
 * @author djh on  2018/9/7 14:49
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {

    private void customAnnotation(@CustomAnnotation int i) {
        switch (i) {
            case CustomAnnotation.START:
                System.out.println("Start");
                break;
            case CustomAnnotation.RUNNING:
                System.out.println("Running");
                break;
            case CustomAnnotation.END:
                System.out.println("End");
                break;
            default:

        }
    }

    private void enumUse(EnumStatus enumStatus) {
        switch (enumStatus) {
            case START:
                System.out.println(enumStatus.statusCode);
                break;
            case RUNNING:
                System.out.println(enumStatus.statusCode);
                break;
            case EDN:
                System.out.println(enumStatus.statusCode);
                break;
            default:
        }
    }

    public static void main(String[] args) {
        UseDemo useDemo = new UseDemo();
        useDemo.customAnnotation(CustomAnnotation.START);
        useDemo.enumUse(EnumStatus.START);
    }
}
