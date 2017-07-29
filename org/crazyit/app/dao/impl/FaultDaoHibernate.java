package org.crazyit.app.dao.impl;

import org.crazyit.app.dao.ChetreeDao;
import org.crazyit.app.dao.FaultDao;
import org.crazyit.app.domain.Cscf1SVehicletreeEntity;
import org.crazyit.app.domain.FaultEntity;
import org.crazyit.common.hibernate3.support.YeekuHibernateDaoSupport;

import java.util.List;
import java.util.Map;

/**
 * Created by 010200022422 on 2017/7/28.
 */
public class FaultDaoHibernate extends YeekuHibernateDaoSupport
        implements FaultDao {

    @Override
    public FaultEntity get(Integer id) {
        return getHibernateTemplate()
                .get(FaultEntity.class , id);
    }

    @Override
    public List<FaultEntity> findAll() {
        return (List<FaultEntity>)getHibernateTemplate()
                .find("from FaultEntity ");
    }

    @Override
    public List<Object[]> findguzhangbyche(String che) {
        return (List<Object[]>)getHibernateTemplate().find("from FaultEntity as f , FaultCfgEntity as c where f.faultId = c.fltId and f.faultVersion=c.fltVersion  and f.faultState=1 and f.faultVehicle = '"+che+"' ");

    }

    @Override
    public long findbychecount(String che) {
        return (Long)getHibernateTemplate().find("select COUNT(*) from FaultEntity as f , FaultCfgEntity as c where f.faultId = c.fltId and f.faultVersion=c.fltVersion  and f.faultState=1 and f.faultVehicle ='1001'").get(0);
    }

    @Override
    public List<Object[]> findguzhangby(String che, int offset, int page) {
        return (List<Object[]>)getHibernateTemplate().find("from FaultEntity as f , FaultCfgEntity as c where f.faultId = c.fltId and f.faultVersion=c.fltVersion  and f.faultState=1 and f.faultVehicle = '"+che+"' ");


     //   return  (List<Object[]>)findByPage("from FaultEntity as f , FaultCfgEntity as c where f.faultId = c.fltId and f.faultVersion=c.fltVersion  and f.faultState=1 and f.faultVehicle ='1001'",offset,page);

    }
}
