package org.crazyit.app.service;

import java.util.List;
import java.util.Map;

import org.crazyit.app.domain.*;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * @author
 * @version  1.0
 */
public interface MyService
{
	//首页

	public List<Employee> findlikeNameAndPass(String name,String pass);

	//状态页各种动态实现 zelc
	public List<Cscf1SVehicletreeEntity> getchetree();
	public List<String> getchaifenzhuangtainewbyche(String che,List<EventCfgEntity> evtcfg1,List<EventCfgEntity> evtcfg2);
	//选择页的数据更多不仅需要状态页的。
	public Map<String , List<String>>gettainewbyche(Integer che_id,String che,Integer che_leibie,Integer xiangmuid,List<EventCfgEntity> evtcfg1,List<EventCfgEntity> evtcfg2);

	public List<Object[]> findguzhangby( String che,int offset,int page);

	int findguzhangbycount(String che);

    List<EventCfgEntity> getevtcfg1();

	List<EventCfgEntity> getevtcfg2();
}
