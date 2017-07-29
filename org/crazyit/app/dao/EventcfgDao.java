package org.crazyit.app.dao;

import org.crazyit.app.domain.EventCfgEntity;

import java.util.List;

/**
 * Created by 010200022422 on 2017/7/24.
 */
public interface EventcfgDao {
     EventCfgEntity get(Integer id);
    List<EventCfgEntity> findAllbytype(Integer type);
}
