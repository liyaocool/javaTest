package redisTest;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class RedisJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("");
        jedis.auth("123456");
        //查看服务是否运行
        System.out.println("连接成功,服务正在运行: " + jedis.ping());

        jedis.set("text", "zhangsan");
        System.out.println(jedis.get("text"));

        Map<String, String> user = new HashMap<>();
        user.put("name", "lisi");
        user.put("age", "16");
        jedis.hset("user", user);
        System.out.println(jedis.hget("user", "age"));
        jedis.save();
    }
}
