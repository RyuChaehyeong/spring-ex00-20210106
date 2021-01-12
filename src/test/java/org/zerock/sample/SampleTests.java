package org.zerock.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


//@Log4j는 log라는 필드를 사용할 수 있게 자동으로 만들어준다.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	@Autowired
	private ApplicationContext context;
	
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	@Test
	public void textExist() {
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("---------------");
		log.info(restaurant.getChef());
	}
	
	@Test
	public void testExist2() {
		
		//injection
		Chef c1 = (Chef) context.getBean("chef");
		Restaurant r1 = (Restaurant) context.getBean("restaurant");
		
		assertNotNull(r1.getChef());
		
		log.info("-------");
		assertNotNull(context);
		
		//bean이 잘 있다고 알려줌. not null이더라!
		assertNotNull(context.getBean("chef"));
		assertNotNull(context.getBean("restaurant"));
		
	}

}
