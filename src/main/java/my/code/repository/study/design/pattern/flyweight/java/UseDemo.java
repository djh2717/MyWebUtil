package my.code.repository.study.design.pattern.flyweight.java;

/**
 * 享元模式: 关键字 "享".
 * <p>
 * This pattern is use to when the system have a lot of repeat object, so we should reuse
 * them not is rebuild, that will let the gc very frequently, and let the efficiency
 * reduce.
 *
 * @author djh on  2018/9/19 22:26
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        Ticket ticket = TicketFactory.getTicket("北京", "上海");
        ticket.showTicketInfo("上铺");
        Ticket ticket1 = TicketFactory.getTicket("北京", "上海");
        System.out.println(ticket == ticket1);
    }
}
