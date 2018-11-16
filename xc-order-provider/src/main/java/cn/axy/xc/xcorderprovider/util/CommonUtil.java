package cn.axy.xc.xcorderprovider.util;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
public class CommonUtil {

    /**
     * 生成唯一订单号
     * @param machineId
     * @return
     */
    public static String getOrderIdByUUId(String machineId) {

        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        String orderId=machineId + String.format("%015d", hashCodeV);
        log.info("生成唯一订单ID：" + orderId);
        return orderId;
    }


    public static void main(String[] args) {
        getOrderIdByUUId("1");
    }
}
