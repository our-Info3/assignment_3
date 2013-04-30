package gildedrose.strategy;

import gildedrose.original.Item;

public class UpdateStrategy {
    /**
     * update strategy for regular items, incomplete implementation.
     * this method has to be overwritten by subclasses/other strategies.
     * @param item
     */
	public void update(Item item) {
		int quality = item.getQuality();
		int sellIn = item.getSellIn();
		sellIn = calculateNewSellIn(sellIn);
		quality = calculateNewQuality(quality,sellIn);
		item.setQuality(quality);
		item.setSellIn(sellIn);	
	}
	public int calculateNewQuality(int quality, int sellIn) {
		return quality-1;
	}
	public int calculateNewSellIn(int oldSellIn){
		return oldSellIn-1;
	}

	

}
