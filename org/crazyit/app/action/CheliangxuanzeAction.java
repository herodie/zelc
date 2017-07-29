package org.crazyit.app.action;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import java.util.*;

import org.crazyit.app.domain.*;
import org.crazyit.app.service.*;
/**
 * Created by 010200022422 on 2017/7/24.
 */
public class CheliangxuanzeAction implements Action {
    //下面是用于封装用户请求参数的两个属性
    public Integer che_id=0;
    public Integer che_leibie=0;
    public Integer xiangmuid=0;
    public String che="";
    private Map<String , List<String>> map
            = new HashMap<String , List<String>>();
    private MyService ms;
    public void setMs(MyService ms)
    {
        this.ms = ms;
    }
    private List<EventCfgEntity> evtcfg1 ;
    private List<EventCfgEntity> evtcfg2 ;

    @Override public String execute() throws Exception {
//   //下面是查询一个list根据 上面3个变量
        evtcfg1 = ms. getevtcfg1();
        evtcfg2 = ms.getevtcfg2();
        setMap(ms.gettainewbyche(che_id,che,che_leibie,xiangmuid,evtcfg1,evtcfg2));
     //热按后map输出输出到表。
      //success 返回到选择页面
//
        return SUCCESS;
    }


    public Map<String, List<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }
}
