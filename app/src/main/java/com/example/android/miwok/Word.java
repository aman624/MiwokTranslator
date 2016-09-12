package com.example.android.miwok;

/**
 * Created by abakshi on 9/11/2016.
 */
public class Word {
    private static final int NO_IMAGE = -1;

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE;
    private int audioResourseId;

    public Word(String d, String m, int a) {
        miwokTranslation = m;
        defaultTranslation = d;
        audioResourseId = a;
    }

    public Word(String d, String m, int i, int a) {
        miwokTranslation = m;
        defaultTranslation = d;
        imageResourceId = i;
        audioResourseId = a;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE;
    }

    public int getAudioResourseId() {
        return audioResourseId;
    }
}
