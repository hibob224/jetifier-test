package com.galajeu.jetifierissue2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;

public class JetifierResultReceiver extends ResultReceiver {

    @SuppressLint("RestrictedApi")
    public JetifierResultReceiver(Handler handler) {
        super(handler);
    }
}
