package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.view.View;

import java.util.List;

/**
 * Stub class for ImageViewer - temporary placeholder until dependency is available
 * TODO: Add proper dependency or implement alternative image viewer
 */
public class ImageViewer {
    
    private String currentUrl;
    
    private ImageViewer() {
        // Private constructor
    }
    
    public String getUrl() {
        return currentUrl != null ? currentUrl : "";
    }
    
    public static class Builder<T> {
        private Context context;
        private List<T> images;
        
        public Builder(Context context, List<T> images) {
            this.context = context;
            this.images = images;
        }
        
        public Builder<T> setStartPosition(int position) {
            return this;
        }
        
        public Builder<T> setOverlayView(View overlayView) {
            return this;
        }
        
        public Builder<T> setImageChangeListener(OnImageChangeListener listener) {
            return this;
        }
        
        public Builder<T> setOnDismissListener(OnDismissListener listener) {
            return this;
        }
        
        public ImageViewer show() {
            // Stub implementation - does nothing
            return new ImageViewer();
        }
    }
    
    public interface OnImageChangeListener {
        void onImageChange(int position);
    }
    
    public interface OnDismissListener {
        void onDismiss();
    }
    
    public void dismiss() {
        // Stub implementation
    }
}

