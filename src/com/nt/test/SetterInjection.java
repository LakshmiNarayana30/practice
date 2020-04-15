package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;
public class SetterInjection {


	public static void main(String[] args) {
		WishMessageGenerator generator=null;

		Resource res=new FileSystemResource("D:/classroom/spring/src/com/nt/cfgs/ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);

	    generator=(WishMessageGenerator)factory.getBean("wmg");
	


		System.out.println("result="+generator.wishMessageGenerate("raja"));
	}

}
