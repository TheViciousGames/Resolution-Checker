package com.theviciousgames.resolutionchecker;

import android.app.Activity;
import android.graphics.Point;
import android.util.DisplayMetrics;

public class Display {
    public static class Resolution {
        public static String getResolution(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int height= displayMetrics.heightPixels;
            int width = displayMetrics.widthPixels;
            return height+"x"+width;
        }
        public static String getRealResolution(Activity activity)
        {
            Point size = new Point();
            android.view.Display display = activity.getWindowManager().getDefaultDisplay();
            display.getRealSize(size);
            int realWidth = size.x;
            int realHeight = size.y;
            return realHeight+"x"+realWidth;
        }
    }
}
