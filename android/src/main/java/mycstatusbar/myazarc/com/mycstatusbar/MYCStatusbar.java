package mycstatusbar.myazarc.com.mycstatusbar;

import android.app.Activity;
import android.graphics.Color;
import android.view.Window;
import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by myc on 07.10.2017.
 */

public class MYCStatusbar extends ReactContextBaseJavaModule {

    public MYCStatusbar(ReactApplicationContext applicationContext){
        super(applicationContext);
    }

    @Override
    public String getName() {
        return "MYCStatusbar";
    }

    @ReactMethod
    public void setColor(String colorHex){
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            final Activity activity = getCurrentActivity();
            if (activity != null) {
                Window window = activity.getWindow();


                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);


                window.setStatusBarColor(Color.parseColor(colorHex));
            }
        }
    }

}
