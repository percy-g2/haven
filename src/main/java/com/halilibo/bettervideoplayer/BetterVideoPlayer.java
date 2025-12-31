package com.halilibo.bettervideoplayer;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;

/**
 * Stub class for BetterVideoPlayer - temporary placeholder until dependency is available
 * TODO: Add proper dependency or implement alternative
 */
public class BetterVideoPlayer extends View {
    
    private BetterVideoCallback callback;
    
    public BetterVideoPlayer(Context context) {
        super(context);
    }
    
    public BetterVideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    
    public BetterVideoPlayer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    
    public void setCallback(BetterVideoCallback callback) {
        this.callback = callback;
    }
    
    public void setAutoPlay(boolean autoPlay) {
        // Stub implementation
    }
    
    public void setSource(Uri source) {
        // Stub implementation
    }
    
    public void pause() {
        // Stub implementation
    }
    
    public void showControls() {
        // Stub implementation
    }
}

