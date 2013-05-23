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
		String name = item.getName();
		sellIn = calculateNewSellIn(sellIn, name);
		quality = calculateNewQuality(quality,sellIn, name);
		item.setQuality(quality);
		item.setSellIn(sellIn);	
	}
	public int calculateNewQuality(int quality, int sellIn, String name) {
		if (name.equals("Conjured mana cake")){
			if (sellIn <= 0){
				return checkQuality(quality-4);
			}else{
				return checkQuality(quality-2);
			}
		}
		if (name.equals("Sulfuras, Hand of Ragnaros")){
			return 80;
		}
		if (name.equals("Backstage passes to a TAFKAL80ETC concert")){
			if (sellIn < 10 && sellIn >= 5){
				return checkQuality(quality+2);
			}else if (sellIn < 5 && sellIn > 0){
				return checkQuality(quality+3);
			}
			else if (sellIn < 0){
				return 0;
			}
		}
		if (sellIn <= 0){
			if (name.equals("Aged Brie")){
				return checkQuality(quality+2);
			}else{
				return checkQuality(quality-2);
			}
		}else if (name.equals("Aged Brie")||name.equals("Backstage passes to a TAFKAL80ETC concert")){
			return checkQuality(quality+1);
		}else if (sellIn > 0){
			return checkQuality(quality-1);
		}else{
			return checkQuality(quality);
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
	
	public int calculateNewSellIn(int oldSellIn, String name){
		if (name.equals("Sulfuras, Hand of Ragnaros")){
			return oldSellIn;
		}
		return oldSellIn-1;
	}

	

}
