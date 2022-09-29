import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;

/**
 * @author:quentin
 * @create: 2022-09-27 23:23
 * @Description: shiro test
 */

public class ShiroTest {
    @Test
    public void shiroTest() {

        RandomNumberGenerator rng = new SecureRandomNumberGenerator();
        ByteSource credentialsSalt = rng.nextBytes();
        String hashAlgorithmName = "MD5";
        String credentials = "123456";
        int hashIterations = 1024;
        Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
        System.out.println(credentialsSalt);
        System.out.println(obj);
    }
}
