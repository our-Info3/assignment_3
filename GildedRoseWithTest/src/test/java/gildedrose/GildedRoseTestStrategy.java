package gildedrose;

import gildedrose.original.Item;
import gildedrose.strategy.GildedRose;

import java.util.List;

public class GildedRoseTestStrategy extends GildedRoseTest {

	public GildedRoseTestStrategy(String message, String itemName,
			int sellIn, int quality, int expectedSellIn, int expectedQuality) {
		super(message, itemName, sellIn, quality, expectedSellIn,
				expectedQuality);
	}


	@Override
	public void setItems(List<Item> items) {
		GildedRose.setItems(items);
	}

	@Override
	public void callUpdateQuality() {
		GildedRose.updateQuality();
	}

}
