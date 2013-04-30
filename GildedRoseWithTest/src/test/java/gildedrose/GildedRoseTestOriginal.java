package gildedrose;

import gildedrose.original.GildedRose;
import gildedrose.original.Item;

import java.util.List;

public class GildedRoseTestOriginal extends GildedRoseTest {

	public GildedRoseTestOriginal(String message, String itemName,
			int sellIn, int quality, int expectedSellIn, int expectedQuality) {
		super(message, itemName, sellIn, quality, expectedSellIn, expectedQuality);
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
