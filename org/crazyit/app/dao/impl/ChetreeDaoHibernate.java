package org.crazyit.app.dao.impl;

import org.crazyit.app.dao.ChetreeDao;
import java.util.*;
import org.crazyit.app.domain.*;
import org.crazyit.common.hibernate3.support.*;
/**
 * Created by 010200022422 on 2017/7/24.
 */
public class ChetreeDaoHibernate
        extends YeekuHibernateDaoSupport
        implements ChetreeDao {
    @Override
    public Cscf1SVehicletreeEntity get(Integer id) {
        return getHibernateTemplate()
                .get(Cscf1SVehicletreeEntity.class , id);
    }

    @Override
    public List<Cscf1SVehicletreeEntity> findAll() {
        return (List<Cscf1SVehicletreeEntity>)getHibernateTemplate()
                .find("from Cscf1SVehicletreeEntity ");
    }

    @Override
    public List<Cscf1SVehicletreeEntity> findbypid(Integer pId) {
        return (List<Cscf1SVehicletreeEntity>)getHibernateTemplate()
                .find("from Cscf1SVehicletreeEntity where pId ="+pId);
    }

    @Override
    public List<Cscf1SVehicletreeEntity> findbyxiangmuid(Integer xiangmuId) {
        return (List<Cscf1SVehicletreeEntity>)getHibernateTemplate()
                .find("from Cscf1SVehicletreeEntity where xiangmuid ="+xiangmuId);
    }

    @Override
    public List<Cscf1SVehicletreeEntity> findbyleibie(Integer leibie) {
        return (List<Cscf1SVehicletreeEntity>)getHibernateTemplate()
                .find("from Cscf1SVehicletreeEntity where leibie ="+leibie);
    }
}
