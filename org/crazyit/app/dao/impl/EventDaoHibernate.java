package org.crazyit.app.dao.impl;

import org.crazyit.app.domain.EventEntity;
import org.crazyit.common.hibernate3.support.YeekuHibernateDaoSupport;
import org.crazyit.app.dao.EventDao;

import java.util.List;

/**
 * Created by 010200022422 on 2017/7/24.
 */
public class EventDaoHibernate
        extends YeekuHibernateDaoSupport
        implements EventDao

{
    @Override
    public EventEntity get(Integer id) {
        return getHibernateTemplate()
                .get(EventEntity.class , id);
    }

    @Override
    public List<EventEntity> findAll() {
        return (List<EventEntity>)getHibernateTemplate()
                .find("from EventEntity ");
    }

    @Override
    public List<EventEntity> findnewonebyche(String che) {
        return (List<EventEntity>)findByPage("from EventEntity where eventVehicle = '"+che+"' order by eventTime desc",0,1);
    }
}
