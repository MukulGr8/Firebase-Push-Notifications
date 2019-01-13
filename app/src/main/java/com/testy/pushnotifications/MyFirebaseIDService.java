package com.testy.pushnotifications;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseIDService extends FirebaseMessagingService{

    @Override
    public void onNewToken(String s) {
        Log.e("NEW_TOKEN", s);
        sendRegistrationToServer(s);
    }

    public void sendRegistrationToServer(String token){


    }

}
