package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * 
 * @author pzhang
 *
 */
@Component
public class TestDubboConsumerService {

	@Reference(version = "1.0.0")
	TestDubboService testDubboService;

	public void test() {
		// TODO Auto-generated method stub
		String words = "江苏";
		System.out.println(testDubboService.sayHello(words));
	}
}
