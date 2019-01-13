package com.testy.pushnotifications;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessageService extends FirebaseMessagingService {

    private static final String tag = "FCM";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.i(tag,"From:"+remoteMessage.getFrom());
        Log.i(tag,"Notification Message"+remoteMessage.getNotification().getBody());
    }
}
