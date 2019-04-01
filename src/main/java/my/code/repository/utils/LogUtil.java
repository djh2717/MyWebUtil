package my.code.repository.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author djh on  2019/3/15 19:48
 * @E-Mail 1544579459@qq.com
 */
public class LogUtil {
    public static final Logger FILE_LOGGER = LogManager.getLogger("MyFileLogger");
    public static final Logger CONSOLE_LOGGER = LogManager.getLogger("MyConsoleLogger");
}
