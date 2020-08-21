package com.mahmoudsaad.xarkas.utils.models;

public class EventSavedState {
    private int itemId;
    private boolean isSaved;

    public EventSavedState(int itemId, boolean isSaved) {
        this.itemId = itemId;
        this.isSaved = isSaved;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }
}
