package com.didispace.web.aspect;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSpringbootAopLogApplicationTests {

	@Autowired
	TestService testService;

	@Test
	public void contextLoads() {
		Map<String, Object> params = new HashMap<>();
		params.put("key1", "v1");
		params.put("key2", "v2");

		testService.insert(params, "000");
		testService.update("name", "id");
		testService.delete("leftso");
		testService.doError("leftso.com");
	}

}