package my.code.repository.study.design.pattern.flyweight.java;

/**
 * @author djh on  2018/9/19 22:16
 * @E-Mail 1544579459@qq.com
 */
public class TicketImp implements Ticket {

    private String fromPlace;
    private String toPlace;
    private int price;

    TicketImp(String fromPlace, String toPlace, int price) {
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
        this.price = price;
    }

    @Override
    public void showTicketInfo(String bunk) {
        System.out.println("起点站:" + fromPlace + " 终点站:" + toPlace + " 价格:" + price + " 铺位:" + bunk);
    }
}
