package com.example.zaxin.bluetoothtest;

import java.util.UUID;

/**
 * the store for the uuid
 * Created by Zaxin on 19/03/2018.
 */

public class Data {
    private static UUID uuid = new UUID(0xFF, 0xFF);

    public static UUID getUUID() {
        return uuid;
    }
}
