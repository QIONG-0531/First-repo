package thread;

public class ThreadPool6 {
    public static void main(String[] args) {
        //JDK8+
        // 根据当前的硬件CPU生成对应个数的线程池，并且是异步执行的
        /**
         * 同步的方式：发请求-->等待执行完成-->有结果返回
         * 异步的方式：发请求-->执行完成-->另一个程序异步处理-->处理完成之后进行回调返回结果
         *
         * 线程池有两个重要的对象：线程、工作队列（Integer最大值）
         * 如果使用前六种创建线程池的方式会导致的问题：
         * 1.线程数量不可控（比如创建带缓存的线程池时）
         * 2.工作任务量不可控（Integer.MAX_VALUE），可能会导致内存溢出
         */
    }
}
