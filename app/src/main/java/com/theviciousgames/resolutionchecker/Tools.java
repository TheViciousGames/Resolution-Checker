package com.theviciousgames.resolutionchecker;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;

public class Tools {
    public static class Utils {
        public static String getResolution(Activity activity) {
            return Display.Resolution.getResolution(activity);
        }
        public static String getRealResolution(Activity activity)
        {
            return Display.Resolution.getRealResolution(activity);
        }
        public static void vibrate(Context context)
        {
            Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(50);
        }
    }
}
