package onlineShop.util;

import java.util.UUID;

public class UUIdUtil {
    String uuid = UUID.randomUUID().toString();
    String[] uuids = uuid.split("-");
    String id = uuids[0];
}
