package {{ args.package }};

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import {{ args.package }}.Service{{ service_name|capitalize }};


public class {{ receiver_name }} extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Service{{ service_name|capitalize }}.start(context, "");
    }
}
