package io.charles;

import redis.clients.jedis.Jedis;

public class RedisProducer {

    /**
     * jedis操作List
     */
    public static void main(String[] args) {

        Jedis jedis = new Jedis(Constant.host, Constant.port);
        for (int i = 0; i < 10; i++) {
            jedis.lpush("informList", "value_" + i);
        }
        jedis.close();
    }

}