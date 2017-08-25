package com.baway.hantianyu;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class IsNet {
     public boolean isNetworkConnected(Context context) {
             if (context != null) {
                 ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                         .getSystemService(Context.CONNECTIVITY_SERVICE);
                 NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
                 if (mNetworkInfo != null) {
                     return mNetworkInfo.isAvailable();
                 }
             }
             return false;
         }
}
