package com.example.android.musicplayer;

/**
 * {@link Song} represents song library in app.
 * It contains a song name, artist name, album name, song resource.
 */

public class Song {

    /**
     * Song name
     */
    private String mSongName;

    /**
     * Artist name
     */
    private String mArtistName;

    /**
     * Album name
     */
    private String mAlbumName;

    /**
     * Audio resource ID for the song
     */
    private int mSongResourceId;

    /**
     * Play button for each song
     */
    private int mPlayButtonId;

    /**
     * Create a new Song object.
     *
     * @param songName       is the song name
     * @param artistName     is the artist name who sing this song
     * @param albumName      is the album name from where is this song
     * @param songResourceId is the resource id for audio of this song
     *                       @param playButtonId is the resource for play / pause button for each song
     */
    public Song(String songName, String artistName, String albumName, int songResourceId, int playButtonId) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
        mSongResourceId = songResourceId;
        mPlayButtonId = playButtonId;
    }

    /**
     * Get song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get artist name who sings the song
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get album name from where is the song.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Return the audio resource ID of the song.
     */
    public int getSongResourceId() {
        return mSongResourceId;
    }

    /**
     * Return the image of play button for each song.
     */
    public int getPlayButtonId() {
        return mPlayButtonId;
    }
}
