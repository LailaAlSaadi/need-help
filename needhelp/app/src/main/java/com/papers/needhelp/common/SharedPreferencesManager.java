package com.papers.needhelp.common;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    static SharedPreferences sharedpreferences;
    static SharedPreferences.Editor editor;

    public SharedPreferencesManager(Context context) {
        sharedpreferences = context.getSharedPreferences("sp", Context.MODE_PRIVATE);
        editor = sharedpreferences.edit();
    }

    public void putKey(String key, String val) {
        editor.putString(key, val);
        editor.apply();
    }

    public void removeKey(String key) {
        editor.remove(key);
        editor.apply();
    }

    public String getString(String key, String defaultValue) {
        return sharedpreferences.getString(key, defaultValue);

    }
}
