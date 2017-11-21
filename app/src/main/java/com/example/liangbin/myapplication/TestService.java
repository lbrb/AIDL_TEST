package com.example.liangbin.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.IBinder;
import android.os.RemoteException;

public class TestService extends Service {
    public TestService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final IBinder mBinder = new ITest.Stub() {
        @Override
        public int getPid() throws RemoteException {
            return android.os.Process.myPid();
        }
    };
}
