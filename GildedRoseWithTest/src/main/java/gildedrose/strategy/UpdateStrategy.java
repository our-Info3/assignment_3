package gildedrose.strategy;

import gildedrose.original.Item;

public class UpdateStrategy implements UpdateStrategyInterface {
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
		if (sellIn < 0){
			return checkQuality(quality-2);
		}else{
			return checkQuality(quality-1);
		}
	}
	
	public int checkQuality(int quality){
		if (quality < 0){
			return 0;
		}else if (quality > 50){
			return 50;
		}else{
			return quality;
		}
	}
	
	public int calculateNewSellIn(int oldSellIn){
		return oldSellIn-1;
	}

	

}
