package org.crazyit.app.dao.impl;

import org.crazyit.app.dao.EventcfgDao;
import org.crazyit.app.domain.EventCfgEntity;
import org.crazyit.common.hibernate3.support.YeekuHibernateDaoSupport;

import java.util.List;

/**
 * Created by 010200022422 on 2017/7/24.
 */
public class EventcfgDaoHibernate
        extends YeekuHibernateDaoSupport
        implements EventcfgDao
{
    @Override
    public EventCfgEntity get(Integer id) {
        return getHibernateTemplate()
                .get(EventCfgEntity.class , id);
    }

    @Override
    public List<EventCfgEntity> findAllbytype(Integer type) {
        return (List<EventCfgEntity>)getHibernateTemplate()
                .find("from EventCfgEntity where evtType = "+ type );
    }
}
