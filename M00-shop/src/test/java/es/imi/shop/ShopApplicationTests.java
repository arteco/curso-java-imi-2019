package es.imi.shop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.imi.shop.component.SimpleComponent;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopApplicationTests {
	
	@Autowired
	SimpleComponent simpleComponent;

	@Test
	// @Deprecated
	public void contextLoads() {
		System.out.println("Debuggeando test");
		String result = simpleComponent.join("hola", "mundo");
		Assert.assertEquals(result, "hola - mundo");
	}

}
