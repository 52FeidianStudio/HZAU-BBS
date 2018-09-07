package org.feidian.hzau.bbs.controller;

import com.jfinal.core.Controller;

/**
 * @author stormphoenix
 * @date 2018-09-08
 * @time 上午1:07
 */
public class IndexController extends Controller {
    public void index() {
        render("index.html");
    }
}
