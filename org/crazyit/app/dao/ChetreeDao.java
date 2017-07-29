package org.crazyit.app.dao;
import java.util.*;

import org.crazyit.app.domain.*;
/**
 * Created by 010200022422 on 2017/7/24.
 */
public interface ChetreeDao {
    Cscf1SVehicletreeEntity get(Integer id);
    List<Cscf1SVehicletreeEntity> findAll();
    List<Cscf1SVehicletreeEntity> findbypid(Integer pId);
    List<Cscf1SVehicletreeEntity> findbyxiangmuid(Integer xiangmuId);
    List<Cscf1SVehicletreeEntity> findbyleibie(Integer leibie);
}
