package com.ryanjairam;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Context;
import android.util.Log;
import android.net.wifi.WifiManager;

public class WifiControlPlugin extends CordovaPlugin {
    private static final String TAG = "WifiControlPlugin";

    public void initialize(CordovaInterface cordova, CordovaWebView webView)
    {
        super.initialize(cordova, webView);
        Log.d(TAG, "Initializing WifiControlPlugin");
    }

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException
    {
        if(action.equals("setWifi"))
        {
            String state = args.getString(0).toLowerCase();
            WifiManager wifiManager = (WifiManager) this.cordova.getActivity().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            wifiManager.setWifiEnabled((state.equals("off")) ? false : true);
            callbackContext.success();
            return true;
        }
        callbackContext.error("Invalid action");
        return false;
    }
}
