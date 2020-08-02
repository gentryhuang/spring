package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Test
 *
 * @author <a href="mailto:libao.huang@yunhutech.com">shunhua</a>
 * @since 2020/08/02
 * <p>
 * desc：
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		bean.ping();


	}





}
