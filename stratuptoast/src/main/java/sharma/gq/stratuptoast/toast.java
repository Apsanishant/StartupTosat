package sharma.gq.stratuptoast;

import android.content.Context;
import android.widget.Toast;

public class toast {
    public static void startUpToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
