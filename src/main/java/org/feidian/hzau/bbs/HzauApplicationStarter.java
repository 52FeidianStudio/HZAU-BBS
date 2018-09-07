package org.feidian.hzau.bbs;

import com.jfinal.core.JFinal;

/**
 * @author wangcheng10@xiaomi.com
 * @create 18-9-5
 */
public class HzauApplicationStarter {
    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8888, "/");
    }
}
