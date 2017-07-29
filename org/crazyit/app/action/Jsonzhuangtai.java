package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.json.annotations.JSON;
import org.crazyit.app.domain.Cscf1SVehicletreeEntity;
import org.crazyit.app.domain.EventCfgEntity;
import org.crazyit.app.domain.EventEntity;
import org.crazyit.app.service.MyService;

import java.util.*;

public class Jsonzhuangtai
{
    //请求属性
    public String che="1001";
    //系统所用的业务逻辑组件
    private MyService ms;
    public void setMs(MyService ms)
    {
        this.ms = ms;
    }
   private List<Cscf1SVehicletreeEntity> list1=new ArrayList<Cscf1SVehicletreeEntity>();
    private List<String> listzhuangtai=new ArrayList<String>();
    private List<EventCfgEntity> evtcfg1 ;
    private List<EventCfgEntity> evtcfg2 ;
    public String execute()
    {
        evtcfg1 = ms. getevtcfg1();
        evtcfg2 = ms.getevtcfg2();
         setList1(ms.getchetree());
        listzhuangtai= ms.getchaifenzhuangtainewbyche(che,evtcfg1,evtcfg2);
        return Action.SUCCESS;
    }


    public List<Cscf1SVehicletreeEntity> getList1() {
        return list1;
    }

    public void setList1(List<Cscf1SVehicletreeEntity> list1) {
        this.list1 = list1;
    }


    public List<String> getListzhuangtai() {
        return listzhuangtai;
    }

    public void setListzhuangtai(List<String> listzhuangtai) {
        this.listzhuangtai = listzhuangtai;
    }

}