package com.ironbank.money.raven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = MoneyRavenApplication.class, loader=CustomSpringApplicationContextLoader.class)
public class MoneyRavenApplicationTests {

	@Test
	public void contextLoads() {
	}

}
