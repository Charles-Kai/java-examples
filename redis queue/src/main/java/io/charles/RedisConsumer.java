package io.charles;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisConsumer {
    /**
     * jedis操作List
     */
    public static void main(String[] args){
        while(true) {
            Jedis jedis = new Jedis(Constant.host, Constant.port);
            //阻塞式brpop，List中无数据时阻塞
            //参数0表示一直阻塞下去，直到List出现数据
            List<String> list = jedis.brpop(0, "informList");
            for(String s : list) {
                System.out.println(s);
            }
            jedis.close();

        }

    }

}
