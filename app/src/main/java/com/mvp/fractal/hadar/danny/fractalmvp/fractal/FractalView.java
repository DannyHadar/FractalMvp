package com.mvp.fractal.hadar.danny.fractalmvp.fractal;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class FractalView extends View {

    public static final String TAG = FractalView.class.getSimpleName();
    private FractalPainter mFractal;

    public FractalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setFractal(FractalPainter fractal) {
        mFractal = fractal;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mFractal != null) {
            mFractal.drawFractal(canvas, getWidth(), getHeight());
        }
    }
}