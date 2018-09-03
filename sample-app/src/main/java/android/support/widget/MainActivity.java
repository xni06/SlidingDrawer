package android.support.widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private SlidingDrawer slidingDrawer;
    private int count1;
    private int count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        slidingDrawer = findViewById(R.id.slidingDrawer);

        findViewById(R.id.interactiveWidget1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) v).setText(String.valueOf(++count1));
            }
        });
        findViewById(R.id.interactiveWidget2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) v).setText(String.valueOf(++count2));
            }
        });
        findViewById(R.id.maskView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slidingDrawer.setDrawerOpen(false);
            }
        });

    }

    public void onOpen(View view) {
        slidingDrawer.setDrawerOpen(false);
    }

    public void onOpenAnimated(View view) {
        slidingDrawer.setDrawerOpen(true);
    }

    public void onClose(View view) {
        slidingDrawer.setDrawerClosed(false);
    }

    public void onCloseAnimated(View view) {
        slidingDrawer.setDrawerClosed(true);
    }

}
