package cz.cvut.fel.ts1.archive;

import cz.cvut.fel.ts1.shop.Item;

class ItemPurchaseArchiveEntry {
    private Item refItem;
    private int soldCount;
    
    ItemPurchaseArchiveEntry(Item refItem) {
        this.refItem = refItem;
        soldCount = 1;
    }

    public void setRefItem(Item refItem) {
        this.refItem = refItem;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }

    void increaseCountHowManyTimesHasBeenSold(int x) {
        soldCount += x;
    }
    
    int getCountHowManyTimesHasBeenSold() {
        return soldCount;
    }
    
    Item getRefItem() {
        return refItem;
    }
    
    @Override
    public String toString() {
        return "ITEM  "+refItem.toString()+"   HAS BEEN SOLD "+soldCount+" TIMES";
    }
}
