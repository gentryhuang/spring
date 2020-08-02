package com.test;

import org.springframework.stereotype.Component;

/**
 * Person
 *
 * @author <a href="mailto:libao.huang@yunhutech.com">shunhua</a>
 * @since 2020/08/02
 * <p>
 * desc：
 */
@Component
public class Person {
	public void ping(){
		System.out.println("ping pong");
	}
}
