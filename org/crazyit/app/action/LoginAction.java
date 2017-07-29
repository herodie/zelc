package org.crazyit.app.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.crazyit.app.domain.*;
import org.crazyit.app.service.*;
 
public class LoginAction
	implements Action
{
	//下面是用于封装用户请求参数的两个属性
	private String username;
	private String password;
	//用于封装处理结果的属性
	private String tip;
	//系统所用的业务逻辑组件
 	private MyService ms;
  
	//设置注入业务逻辑组件所必需的setter方法
 	
 	
  	public void setMs(MyService ms)
  	{
  		this.ms = ms;
     }
	//username属性的setter和getter方法
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getUsername()
	{
		return this.username;
	}
	//password属性所必需的setter和getter方法
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	//tip属性的getter和setter方法
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}
	//处理用户请求的execute方法
	public String execute() throws Exception
	{
		 ActionContext ctx =ActionContext.getContext();
		
	 	 //name和quanxian放入session
	 	List<Employee> l=ms.findlikeNameAndPass(username, password);
	 	if (l.size()>0)
		{
	 		String s=l.get(0).getName();
		  	setTip("成功！");
		  	 ctx.getSession().put("user", username);
			return SUCCESS;
		}
		else
		{
			setTip("哈哈，没有找到此用户名");
			return ERROR;
		}
	 
		
	}
}
