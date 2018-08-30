package android.support.widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private SlidingDrawer slidingDrawer;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        slidingDrawer = findViewById(R.id.slidingDrawer);
    }

    public void onOpen(View view) {
        slidingDrawer.setsetDrawerOpen(false);
    }

    public void onOpenAnimated(View view) {
        slidingDrawer.setsetDrawerOpen(true);
    }

    public void onClose(View view) {
        slidingDrawer.setDrawerClosed(false);
    }

    public void onCloseAnimated(View view) {
        slidingDrawer.setDrawerClosed(true);
    }

    public void onTextViewClick(View view) {
        TextView tv = findViewById(R.id.interactive_widget);
        tv.setText(String.valueOf(++count));
    }
}
