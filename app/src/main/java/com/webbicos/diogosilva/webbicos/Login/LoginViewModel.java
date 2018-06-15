package com.webbicos.diogosilva.webbicos.Login;

import android.text.TextUtils;

import com.webbicos.diogosilva.webbicos.Utils.SharedPreferencesHelper;

/**
 * Created by diogosilva on 15/06/18.
 */

public class LoginViewModel {
    private static final String KEY_TOKEN = "facebook_token";



    public boolean isAuthenticated() {
        return !TextUtils.isEmpty(SharedPreferencesHelper.with(mContext).getString(KEY_TOKEN, ""));
    }




}
