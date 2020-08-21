package com.mahmoudsaad.xarkas.utils.models;

public class ArtFavoriteState {
    private int itemId;
    private boolean isFavorite;

    public ArtFavoriteState(int itemId, boolean isFavorite) {
        this.itemId = itemId;
        this.isFavorite = isFavorite;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
