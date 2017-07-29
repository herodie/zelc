package org.crazyit.app.dao;

import org.crazyit.app.domain.Cscf1SVehicletreeEntity;
import org.crazyit.app.domain.FaultEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by 010200022422 on 2017/7/28.
 */
public interface FaultDao {
    FaultEntity get(Integer id);
    List<FaultEntity> findAll();
    List<Object[]> findguzhangbyche(String che);
    long findbychecount(String che);
    List<Object[]> findguzhangby(String che, int offset, int page);
}
