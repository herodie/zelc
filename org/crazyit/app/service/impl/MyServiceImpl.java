package org.crazyit.app.service.impl;

import java.util.*;

import org.crazyit.app.dao.*;
import org.crazyit.app.domain.*;
import org.crazyit.app.service.*;

/**

 */
public class MyServiceImpl
        implements MyService {
    //Dao注入
    private EmployeeDao empDao;

    public void setEmpDao(EmployeeDao empDao) {
        this.empDao = empDao;
    }

    private ChetreeDao chetreeDao;

    public void setChetreeDao(ChetreeDao chetreeDao) {
        this.chetreeDao = chetreeDao;
    }

    private EventDao eventDao;
    private EventcfgDao eventcfgDao;
    private FaultDao faultDao;

    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    public void setEventcfgDao(EventcfgDao eventcfgDao) {
        this.eventcfgDao = eventcfgDao;
    }


    //登录服务
    @Override
    public List<Employee> findlikeNameAndPass(String name, String pass) {
        // TODO Auto-generated method stub
        return empDao.findlikeNameAndPass(name, pass);

    }

    @Override
    public List<Cscf1SVehicletreeEntity> getchetree() {

        return chetreeDao.findAll();
    }

    //单个车的状态查询 组合多个到一个状态,xy 起止，其余都是为了完成函数的变量
    private void zuhe1(int x, int y, int i, String strf, List<String> list2, List<String> listall, List<EventCfgEntity> evtcfg2) {

        if (i == x) strf = "";
        if (list2.get(i).equals("1") && strf.equals("")) {
            strf = evtcfg2.get(i).getEvtNameL1() + ":" + list2.get(i);
        }
        if (!strf.equals("")) listall.add(strf);
        if (i == y && strf == "") listall.add(evtcfg2.get(i).getEvtNameL1() + list2.get(i));

    }

    private void zuhe2(int x, int y, int i, String strf, List<String> list2, List<String> listall, List<EventCfgEntity> evtcfg2) {

        if (i == x) strf = "";
        if (list2.get(i).equals("1")) {
            strf = evtcfg2.get(i).getEvtNameL1() + ":" + list2.get(i);
        }
        if (i == y && strf == "") listall.add(evtcfg2.get(i).getEvtNameL1() + list2.get(i));
        else if (i == y && strf != "") listall.add(strf);
    }

    public List<EventCfgEntity> getevtcfg1() {
        return eventcfgDao.findAllbytype(2);
    }


    public List<EventCfgEntity> getevtcfg2() {
        return eventcfgDao.findAllbytype(1);
    }

    @Override
    public List<String> getchaifenzhuangtainewbyche(String che,List<EventCfgEntity> evtcfg1,List<EventCfgEntity> evtcfg2) {
        //cfg查询结果，循环查询 合成一个str输出
        List<EventEntity> evt = eventDao.findnewonebyche(che);
        List<String> listall = new ArrayList<String>();
        String strf = "";
        String strq = "";
        if (evt.size() > 0) {
            //这个2是模拟量

            String str1 = evt.get(0).getEventAnalog();
            String str2 = evt.get(0).getEventDigital();
            //拆分str
            List<String> list1 = Arrays.asList(str1.split(","));
            List<String> list2 = Arrays.asList(str2.split(","));
            //遍历1是模拟2是数字量
            if (list1.size() >= evtcfg1.size() && list2.size() >= evtcfg2.size()) {

                for (int i = 0; i < evtcfg1.size(); i++) {
                    if (i < 6) {
                        listall.add(list1.get(i));
                    }
                    if (i >= 6) {
                        strq = list1.get(i) + evtcfg1.get(i).getEvtNameL1();
                        strf += strq;
                    }
                }
                listall.add(strf);
                strf = "";
                //数字量2
                for (int i = 0; i < evtcfg2.size(); i++) {
                    //前后
                    if (i >= 0 && i <= 5) {
                        zuhe1(0, 5, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 8 && i <= 9) {
                        zuhe1(8, 9, i, strf, list2, listall, evtcfg2);
                        continue;
                    }

                    //牵引制动
                    if (i >= 10 && i <= 11) {
                        zuhe1(10, 11, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc1悬浮
                    if (i >= 26 && i <= 28) {
                        zuhe2(26, 28, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc悬浮
                    if (i >= 29 && i <= 31) {
                        zuhe2(26, 28, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc2
                    if (i >= 32 && i <= 34) {
                        zuhe2(32, 34, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc1车1号门
                    if (i >= 98 && i <= 105) {
                        zuhe1(98, 105, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc1车2号门
                    if (i >= 106 && i <= 113) {
                        zuhe1(106, 113, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc1车3号门
                    if (i >= 114 && i <= 121) {
                        zuhe1(114, 121, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc1车4号门
                    if (i >= 122 && i <= 129) {
                        zuhe1(122, 129, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //M车门
                    if (i >= 130 && i <= 137) {
                        zuhe1(130, 137, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 138 && i <= 145) {
                        zuhe1(138, 145, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 146 && i <= 153) {
                        zuhe1(146, 153, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 154 && i <= 161) {
                        zuhe1(154, 161, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    //Mc2车门
                    if (i >= 162 && i <= 169) {
                        zuhe1(162, 169, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 170 && i <= 177) {
                        zuhe1(170, 177, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 178 && i <= 185) {
                        zuhe1(178, 185, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 186 && i <= 193) {
                        zuhe1(186, 193, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 194 && i <= 196) {
                        zuhe1(194, 196, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 197 && i <= 199) {
                        zuhe1(197, 199, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 200 && i <= 202) {
                        zuhe1(200, 202, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 203 && i <= 205) {
                        zuhe1(203, 205, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 206 && i <= 208) {
                        zuhe1(206, 208, i, strf, list2, listall, evtcfg2);
                        continue;
                    }
                    if (i >= 209 && i <= 211) {
                        zuhe1(209, 211, i, strf, list2, listall, evtcfg2);
                        continue;
                    }

                    //其余的正常添加；看具体内容需要看excel表。
                    {
                        listall.add(list2.get(i));
                    }
                }
                if (evt.get(0).getEventLatitude() != null && evt.get(0).getEventLongitude() != null) {
                    listall.add(evt.get(0).getEventLatitude().toString());
                    listall.add(evt.get(0).getEventLongitude().toString());
                }

                return listall;
            } else
                return null;

        } else
            return null;
    }


    @Override
    public Map<String, List<String>> gettainewbyche(Integer che_id, String che, Integer che_leibie, Integer xiangmuid,List<EventCfgEntity> evtcfg1,List<EventCfgEntity> evtcfg2) {
        Map<String, List<String>> map
                = new HashMap<String, List<String>>();

        if (che_leibie == 3)
            map.put(che, getchaifenzhuangtainewbyche(che,evtcfg1,evtcfg2));

        if (che_leibie == 2) {
            //线路查一个list che来,che查询并存入map
            List<Cscf1SVehicletreeEntity> chetree = chetreeDao.findbypid(che_id);
            if (chetree != null)
                for (int i = 0; i < chetree.size(); i++) {
                    String str = chetree.get(i).getName();

                    map.put(str, getchaifenzhuangtainewbyche(str,evtcfg1,evtcfg2));

                }
        }
        if (che_leibie == 1) {
            List<Cscf1SVehicletreeEntity> chetree = chetreeDao.findbyxiangmuid(che_id);
            if (chetree != null)
                for (int i = 0; i < chetree.size(); i++) {
                    String str = chetree.get(i).getName();
                    map.put(str, getchaifenzhuangtainewbyche(str,evtcfg1,evtcfg2));

                }
        }
        if (che_leibie == 0) {
            List<Cscf1SVehicletreeEntity> chetree = chetreeDao.findbyleibie(3);
            if (chetree != null)
                for (int i = 0; i < chetree.size(); i++) {
                    String str = chetree.get(i).getName();
                    map.put(str, getchaifenzhuangtainewbyche(str,evtcfg1,evtcfg2));

                }
        }
        return map;
    }

    @Override
    public List<Object[]> findguzhangby(String che, int offset, int page) {


        return faultDao.findguzhangby(che, offset, page);
    }

    @Override
    public int findguzhangbycount(String che) {
        return (int) faultDao.findbychecount(che);
    }


    public void setFaultDao(FaultDao faultDao) {
        this.faultDao = faultDao;
    }
}
