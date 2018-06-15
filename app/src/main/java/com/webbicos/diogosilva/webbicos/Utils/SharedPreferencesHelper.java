package com.webbicos.diogosilva.webbicos.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by diogosilva on 15/06/18.
 */

public class SharedPreferencesHelper {


    private static final String MyPREFERENCES = "web_bicos_preferences";

    private SharedPreferences sharedpreferences;

    private static SharedPreferencesHelper mSharedPreferencesHelper;

    public static SharedPreferencesHelper with(Context context) {
        if (mSharedPreferencesHelper == null) {
            synchronized (SharedPreferencesHelper.class) {
                if (mSharedPreferencesHelper == null) {
                    mSharedPreferencesHelper = new SharedPreferencesHelper(context);
                }
            }
        }
        return mSharedPreferencesHelper;
    }

    private SharedPreferencesHelper(Context context) {
        this.sharedpreferences = context.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
    }

    public String getString(String key) {
        return sharedpreferences.getString(key, null);
    }

    public String getString(String key, String defaultValue) {
        return sharedpreferences.getString(key, defaultValue);
    }

    public void setString(String key, String value) {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public int getInt(String key) {
        return sharedpreferences.getInt(key, -1);
    }

    public int getInt(String key, int defValue) {
        return sharedpreferences.getInt(key, defValue);
    }

    public void setInt(String key, Integer value) {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public long getLong(String key) {
        return sharedpreferences.getLong(key, -1);
    }

    public long getLong(String key, long defaultValue) {
        return sharedpreferences.getLong(key, defaultValue);
    }

    public void setLong(String key, Long value) {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public float getFloat(String key) {
        return sharedpreferences.getFloat(key, -1);
    }

    public void setFloat(String key, Float value) {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key, boolean defValue) {
        return sharedpreferences.getBoolean(key, defValue);
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    public void setBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

}