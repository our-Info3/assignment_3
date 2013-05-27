package gildedrose.strategy;

import gildedrose.original.Item;

public interface UpdateStrategyInterface {
	public void update(Item item);
	public int calculateNewQuality(int quality, int sellIn);
	public int checkQuality(int quality);
	public int calculateNewSellIn(int oldSellIn);
}
