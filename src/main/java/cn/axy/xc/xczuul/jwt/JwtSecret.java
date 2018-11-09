package cn.axy.xc.xczuul.jwt;

import cn.axy.xc.xczuul.utils.UUIDUtil;

import javax.print.attribute.standard.PrinterURI;

public class JwtSecret {
    public static final String TheJwtScret = UUIDUtil.getUUID();

    // 过期时间 24 小时
    public static final int EXPIRE_TIME = 60 * 24 * 60 * 1000;
}
