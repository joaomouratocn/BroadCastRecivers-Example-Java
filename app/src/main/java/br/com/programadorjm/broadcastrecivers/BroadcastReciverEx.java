package br.com.programadorjm.broadcastrecivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastReciverEx extends BroadcastReceiver {

    // oque será executado assim que a condição do broadcastReciver for satisfeita,
    @Override
    public void onReceive(Context context, Intent intent) {
        //Realize apenas operações curtas, pois o sistema pode eliminar este processo para liberar recurso para outro processo
        if(intent != null){
            String toastMessege = "Unknow intent";
            switch (intent.getAction()){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessege = "Power connected";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessege = "Power disconected";
                    break;
            }
            Toast.makeText(context, toastMessege, Toast.LENGTH_SHORT).show();
        }
    }

    //para Trabalhos mais demorados, ultilize asyncTask ou java.util.concurrent
}
