package lk.jiat.eshop.activity;

import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import lk.jiat.eshop.R;

public class SpiashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            getWindow().setDecorFitsSystemWindows(false);

            WindowInsetsController controller = getWindow().getInsetsController();
            if (controller != null){
                controller.hide(WindowInsets.Type.systemBars() | WindowInsets.Type.navigationBars());
            }
        } else {
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
            );
        }
        setContentView(R.layout.activity_spiash);

        ImageView imageView = findViewById(R.id.splashLogo);
        //imageView.setImageResource(R.drawable.app_logo);

        /*Picasso.get()
                .load(R.drawable.app_logo)
                .resize(300, 300)
                .into(imageView);
        */

        Glide.with(this)
                .asBitmap()
                .load(R.drawable.app_logo)
                .override(300)
                .into(imageView);


    }

}