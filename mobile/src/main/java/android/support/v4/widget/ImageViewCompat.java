package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by matiash on 27/10/2015.
 */
public class ImageViewCompat {

    public static void setImageTintList(@NonNull ImageView imageView, @Nullable ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.setImageTintList(tint);
        }
    }
}
