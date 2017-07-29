package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;

/**
 * Created by 010200022422 on 2017/7/26.
 用于分配显示单个的车详细信息的具体页面，具体数据从json获取。
 */

public class CheliangzhuangtaiAction implements Action {
    public String che="1001";
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
