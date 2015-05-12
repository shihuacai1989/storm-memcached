package trident.memcached;

import net.spy.memcached.MemcachedClient;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by shihc on 2015/5/12.
 */
public class MemcachedQuery {
    public static void main(String[] args) {
        try {
            MemcachedClient mc = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
            while (true){
                Object obj = mc.get("cow");
                String s = new String((byte[])obj, "UTF-8");
                //String s = JSONValue.toJSONString(obj);
                System.out.println(s);//打印输出数字逐渐在增大
                Thread.sleep(1000);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
