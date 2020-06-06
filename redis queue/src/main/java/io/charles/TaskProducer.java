package io.charles;

/**
 * 用于模拟生产者
 */

import java.util.Random;
import java.util.UUID;

import redis.clients.jedis.Jedis;

public class TaskProducer implements Runnable {
    Jedis jedis = new Jedis(Constant.host, Constant.port);

    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(random.nextInt(600) + 600);
                // 模拟生成一个任务
                UUID taskid = UUID.randomUUID();
                //将任务插入任务队列：task-queue
                jedis.lpush(Constant.task_queue, taskid.toString());
                System.out.println("插入了一个新的任务： " + taskid);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}