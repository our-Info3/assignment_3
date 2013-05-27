package gildedrose.strategy;

import gildedrose.original.Item;

public class UpdateStrategyForAgedBrie implements UpdateStrategyInterface {
	
	public void update(Item item) {
		int quality = item.getQuality();
		int sellIn = item.getSellIn();
		sellIn = calculateNewSellIn(sellIn);
		quality = calculateNewQuality(quality,sellIn);
		item.setQuality(quality);
		item.setSellIn(sellIn);	
	}
	public int calculateNewQuality(int quality, int sellIn) {
		if (sellIn <= 0){
				return checkQuality(quality+2);
		}else {
			return checkQuality(quality+1);
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
