package edu.tsinghua.aop;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
/*
		Logger logger=Logger.getLogger(Test.class);
		logger.debug("准备调用方法");
		IBiz ibiz=new Biz();
		logger.debug("执行方法");
		ibiz.buy(10, 5);
		logger.debug("调用完成");
*/
		BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext.xml");
		IBiz biz=(IBiz) bf.getBean("zhenghe");
		biz.buy(2, 4);
		
	}

}
