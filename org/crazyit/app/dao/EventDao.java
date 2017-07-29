package org.crazyit.app.dao;

import org.crazyit.app.domain.EventEntity;

import java.util.List;

/**
 * Created by 010200022422 on 2017/7/24.
 */
public interface EventDao {
    EventEntity get(Integer id);
    List<EventEntity> findAll();
    List<EventEntity> findnewonebyche(String che);
}
