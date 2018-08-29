package android.support.widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private SlidingDrawer sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        sd = findViewById(R.id.slidingDrawer);
    }

    public void onOpen(View view) {
        sd.setsetDrawerOpen(false);
    }

    public void onOpenAnimated(View view) {
        sd.setsetDrawerOpen(true);
    }

    public void onClose(View view) {
        sd.setDrawerClosed(false);
    }

    public void onCloseAnimated(View view) {
        sd.setDrawerClosed(true);
    }

}
