package com.openaura;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Zygimantus
 */
public class Artists {

    @SerializedName("oa_artist_id")
    private String artistId;

    private String name;

    @SerializedName("name_qualifier")
    private String nameQualifier;

    @SerializedName("musicbrainz_id")
    private String musicbrainzId;

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameQualifier() {
        return nameQualifier;
    }

    public void setNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }

    public String getMusicbrainzId() {
        return musicbrainzId;
    }

    public void setMusicbrainzId(String musicbrainzId) {
        this.musicbrainzId = musicbrainzId;
    }

}
