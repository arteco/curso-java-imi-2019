package es.imi.shop.business;

public interface Shop {

	/**
	 * 
	 * @param item si permite o no null, 
	 * @param quantity si permite o cantidades 
	 */
	void addItemToStock(Item item, int quantity);

	int countStock();

}
