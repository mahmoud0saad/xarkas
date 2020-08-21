package com.mahmoudsaad.xarkas.utils.models;

public class ArtistFollowState {
    int artistId;
    boolean isFollow;

    public ArtistFollowState(int artistId, boolean isFollow) {
        this.artistId = artistId;
        this.isFollow = isFollow;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public boolean isFollow() {
        return isFollow;
    }

    public void setFollow(boolean follow) {
        isFollow = follow;
    }
}
