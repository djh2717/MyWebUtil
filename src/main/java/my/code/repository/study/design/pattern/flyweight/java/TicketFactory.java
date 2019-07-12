package my.code.repository.study.design.pattern.flyweight.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author djh on  2018/9/19 22:20
 * @E-Mail 1544579459@qq.com
 */
public class TicketFactory {
    private static Map<String, Ticket> sTicketMap = new HashMap<>(16);

    public static Ticket getTicket(String fromPlace, String toPlace) {
        String key = fromPlace + "-" + toPlace;
        if (sTicketMap.containsKey(key)) {
            return sTicketMap.get(key);
        } else {
            Ticket ticket = new TicketImp(fromPlace, toPlace, new Random().nextInt(300));
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}
