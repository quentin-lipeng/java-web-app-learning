import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author:quentin
 * @create: 2022-09-26 21:58
 * @Description: jedis test
 */

public class JedisTest {
    @Test
    public void jedis(){
        Jedis jedis = new Jedis("172.20.10.10", 6379);
        jedis.set("name", "mike");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();
    }
}
