package com.maxproj.simplewaveform;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

/**
 * Stub class for SimpleWaveform - temporary placeholder until dependency is available
 * TODO: Add proper dependency or implement alternative
 */
public class SimpleWaveform extends View {
    
    // Mode constants
    public static final int MODE_DIRECTION_RIGHT_LEFT = 0;
    public static final int MODE_AMP_ABSOLUTE = 0;
    public static final int MODE_HEIGHT_PERCENT = 0;
    public static final int MODE_ZERO_CENTER = 0;
    public static final int MODE_PEAK_ORIGIN = 0;
    
    // Fields used by the extended class
    public Paint peakPencilFirst;
    public Paint peakPencilSecond;
    public Paint barPencilFirst;
    public Paint barPencilSecond;
    public Paint xAxisPencil;
    
    public int barGap;
    public int modeDirection;
    public int modeAmp;
    public int modeHeight;
    public int modeZero;
    public int modePeak;
    
    public boolean showBar;
    public boolean showPeak;
    public boolean showXAxis;
    
    // Additional fields used by the codebase
    public int firstPartNum;
    public int width;
    public ClearScreenListener clearScreenListener;
    
    public SimpleWaveform(Context context) {
        super(context);
    }
    
    public SimpleWaveform(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    
    public void init() {
        // Stub implementation
    }
    
    public void setDataList(List<?> dataList) {
        // Stub implementation
    }
    
    public void setMaxVal(int maxVal) {
        // Stub implementation
    }
    
    public void refresh() {
        // Stub implementation
        invalidate();
    }
    
    // Inner interface for clear screen listener
    public interface ClearScreenListener {
        void clearScreen(android.graphics.Canvas canvas);
    }
}

