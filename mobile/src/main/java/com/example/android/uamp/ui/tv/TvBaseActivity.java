package com.example.android.uamp.ui.tv;

import android.app.Activity;
import android.support.v4.media.session.MediaControllerCompat;

import com.example.android.uamp.ui.MediaControllerProvider;

/**
 * Created by matiash on 26/10/2015.
 */
public class TvBaseActivity extends Activity implements MediaControllerProvider {

    private MediaControllerCompat mMediaController;

    @Override
    public MediaControllerCompat getSupportMediaController() {
        return mMediaController;
    }

    protected void setSupportMediaController(MediaControllerCompat controller) {
        mMediaController = controller;
    }
}
