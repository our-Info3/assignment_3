package gildedrose.strategy;

import gildedrose.original.Item;

public class UpdateStrategyForSulfura implements UpdateStrategyInterface {

		public void update(Item item) {
			int quality = 80;
			int sellIn = item.getSellIn();
			item.setQuality(quality);
			item.setSellIn(sellIn);	
		}

		public int calculateNewQuality(int quality, int sellIn) {
			// TODO Auto-generated method stub
			return 0;
		}

		public int checkQuality(int quality) {
			// TODO Auto-generated method stub
			return 0;
		}

		public int calculateNewSellIn(int oldSellIn) {
			// TODO Auto-generated method stub
			return 0;
		}

		

	}

