package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.spring.springboot.dubbo.TestDubboService;

/**
 * 
 * @author pzhang
 *
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class TestDubboServiceImpl implements TestDubboService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "你好： "+name;
	}

    
}
