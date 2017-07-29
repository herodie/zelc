package org.crazyit.app.action;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import net.sf.json.JSONObject;
import java.util.*;

import org.crazyit.app.domain.*;
import org.crazyit.app.service.*;

/**
 * Created by 010200022422 on 2017/7/28.
 */
public class GuzhangchaxunAction
{
    private Integer total;
  public  String pager="";
    public String che="1001";
    private MyService ms;
    public void setMs(MyService ms)
    {
        this.ms = ms;
    }
    private List resultData = new ArrayList();

    public String execute() throws Exception {

    //    JSONObject jsonObject = JSONObject.fromObject(pager);
    //    int page = jsonObject.getInt("page");
    //    int pageSize = jsonObject.getInt("pageCapacity");
    //    int offSet = (page-1)*pageSize;
         resultData = ms.findguzhangby("1001",0,2);
       total = ms.findguzhangbycount("1001");
//total=2;
        return Action.SUCCESS;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getResultData() {
        return resultData;
    }

    public void setResultData(List resultData) {
        this.resultData = resultData;
    }
}
