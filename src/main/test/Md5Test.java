import com.sojson.common.utils.LoggerUtils;
import com.sojson.common.utils.MathUtil;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

import java.security.MessageDigest;

/**
 * @author:quentin
 * @create: 2022-09-27 23:37
 * @Description: md5 encode decode
 */

public class Md5Test {
    public static String  getMD5(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (Exception e) {
            LoggerUtils.fmtError(MathUtil.class,e, "MD5转换异常！message：%s", e.getMessage());
        }

        byte[] byteArray = messageDigest.digest();
        StringBuffer md5StrBuff = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
            else
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
        }
        return md5StrBuff.toString();
    }
    @Test
    public void md5Test(){
        Md5Hash md5Hash = new Md5Hash();
//        md5Hash.
    }
}
