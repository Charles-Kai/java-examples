package io.charles;

public class Constant {
    /**
     * redis链接地址
     */
    public static final String host = "127.0.0.1";
    /**
     * redis启动端口
     */
    public static final int port = 6379;
    /**
     * 正式队列列表名称
     */
    public static final String task_queue = "task-queue";
    /**
     * 临时队列列表名称
     */
    public static final String tmp_queue = "tmp-queue";
}
