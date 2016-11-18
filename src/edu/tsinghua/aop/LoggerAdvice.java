package edu.tsinghua.aop;

import java.lang.reflect.Method;

import org.aopalliance.aop.Advice;
//import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;
/*
public class LoggerAdvice implements MethodBeforeAdvice,Advice{
/*
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg0+"\t"+arg0.getName());//方法名
		System.out.println(arg1);//方法的参数
		System.out.println(arg2);//实现类
		
		Logger logger=Logger.getLogger(Test.class);
		logger.debug("准备调用方法");		
		logger.debug("执行方法");				
		
	}

}
*/