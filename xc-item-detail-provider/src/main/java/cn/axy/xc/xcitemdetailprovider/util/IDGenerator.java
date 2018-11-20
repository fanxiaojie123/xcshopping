package cn.axy.xc.xcitemdetailprovider.util;

import com.alibaba.druid.util.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ID生成器
 * @author Administrator
 *
 */
@Component
public class IDGenerator {
    private final static Lock LOCK = new ReentrantLock();
    private final static Condition PAUSE  = LOCK.newCondition();

    /**
     * 简单生成
     * @return
     */
    public static String simple() {
        return simple(null);

    }
    /**
     * 简单生成
     * @return
     */
    public static String simple(String prefix) {
        try {
            LOCK.lock();
            PAUSE.await(1, TimeUnit.MILLISECONDS);
            if (StringUtils.isEmpty(prefix)) {
                return String.valueOf(System.currentTimeMillis());
            } else {
                return prefix + System.currentTimeMillis();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }
    }
    public static long genItemId(int type) {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = type  +  millis + String.format("%02d", end2);
        long id = new Long(str);
        return id;
    }

    public static void main(String[] args) {
        long l = genItemId(1);
        System.out.println(l);
    }
}
