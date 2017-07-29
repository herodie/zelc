package org.crazyit.app.domain;

import java.io.Serializable;
import java.util.*;

/**
 * Description:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Employee
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//标识属性
	private Integer id;
	//员工姓名
	private String name;
	//员工密码
	private String pass;
	//员工工资
	private Integer quanxian;


	//无参数的构造器
	public Employee()
	{
	}
	//初始化全部属性的构造器
	public Employee( String name , String pass , 
			Integer quanxian )
	{
		 
		this.name = name;
		this.pass = pass;
		this.quanxian = quanxian;
		
	}

	//id属性的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	//name属性的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	//pass属性的setter和getter方法
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}

	//salary属性的setter和getter方法
	public void setQuanxian(Integer quanxian)
	{
		this.quanxian = quanxian;
	}
	public Integer getQuanxian()
	{
		return this.quanxian;
	}

 
	//重写equals()方法，只要name、pass相同的员工即认为相等。
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null &&
			obj.getClass() == Employee.class)
		{
			Employee employee = (Employee)obj;
			return this.getName().equals(employee.getName())
				&& this.getPass().equals(employee.getPass());
		}
		return false;
	}
	//根据员工的name、pass来计算hashCode值
	public int hashCode()
	{
		return name.hashCode()
			+ pass.hashCode() * 17;
	}
}