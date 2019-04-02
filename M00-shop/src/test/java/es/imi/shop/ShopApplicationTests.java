package es.imi.shop;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.imi.shop.business.Item;
import es.imi.shop.business.Shop;
import es.imi.shop.business.ShopEnvironment;
import es.imi.shop.business.inmemmory.InMemmoryShopEnvironment;
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
	
	@Test
	public void primerTest() {
		ShopEnvironment env = new InMemmoryShopEnvironment();
		Shop shop = env.getShop();
		Item item = new Item(1L,"Awesome item",new BigDecimal(100.));
		shop.addItemToStock(item, 3);
		Assert.assertTrue(shop.countStock()>0);
	}

}
