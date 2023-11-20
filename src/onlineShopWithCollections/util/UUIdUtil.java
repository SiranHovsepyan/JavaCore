package onlineShopWithCollections.util;

import java.util.UUID;

public class UUIdUtil {

    public static String generateId(){
        String uuid = UUID.randomUUID().toString();
        String[] uuids = uuid.split("-");
        return uuids[0];
    }


}
