package com.xugang.meituan.util;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.WindowManager;

/**
 * Created by idea on 2016/10/10.
 */
public class ScreenUtil {

    public static boolean makeActivityStatusBarTransclucent(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            return true;
        }else {
            return false;
        }
    }

    public static int getStatusBarHeight(Resources resources) {
        int result = 0;
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = resources.getDimensionPixelSize(resourceId);
        }
        return result;
    }

}
