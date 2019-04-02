package es.imi.shop.business.inmemmory;

import java.util.ArrayList;
import java.util.List;

import es.imi.shop.business.Item;
import es.imi.shop.business.Shop;

public class InMemmoryShop implements Shop {
	
	private List<StockItem> stock = new ArrayList<StockItem>();

	@Override
	public void addItemToStock(Item item, int quantity) {
		if(item!=null) {
			boolean found = false;
			for(StockItem stockItem : stock) {
				if (stockItem.item.getId().equals(item.getId())) {
					stockItem.quantity += quantity;
					found = true;
				}
			}
			if (!found) {
				stock.add(new StockItem(item, quantity));
			}
		}
	}

	@Override
	public int countStock() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static class StockItem{
		public StockItem(Item item, int quantity) {
			this.item = item;
			this.quantity = quantity;
		}
		Item item;
		int quantity;
	}
}
