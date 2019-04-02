package es.imi.shop.business.inmemmory;

import es.imi.shop.business.Shop;
import es.imi.shop.business.ShopEnvironment;

public class InMemmoryShopEnvironment implements ShopEnvironment {

	@Override
	public Shop getShop() {
		return new InMemmoryShop();
	}

}
