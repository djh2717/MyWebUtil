package my.code.repository.study.enums.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author djh on  2018/9/7 14:46
 * @E-Mail 1544579459@qq.com
 */
@Retention(RetentionPolicy.SOURCE)
public @interface CustomAnnotation {
    int START = 0;
    int RUNNING = 1;
    int END = 2;
}
