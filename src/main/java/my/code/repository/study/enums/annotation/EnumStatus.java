package my.code.repository.study.enums.annotation;

/**
 * @author djh on  2018/9/7 14:23
 * @E-Mail 1544579459@qq.com
 */
public enum EnumStatus {


    /**
     *
     */
    START(0, "#fff"),

    /**
     *
     */
    RUNNING(1, "#0fff"),

    /**
     *
     */
    EDN(2, "#1fff");


    public int statusCode;
    public String statusColor;

    EnumStatus(int i, String s) {
        statusCode = i;
        statusColor = s;
    }

    public String getColorByCode(int statusCode) {
        for (EnumStatus enumStatus : values()) {
            if (enumStatus.statusCode == statusCode) {
                return enumStatus.statusColor;
            }
        }
        return null;
    }
}
