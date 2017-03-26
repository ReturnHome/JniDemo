package com.example.jnidemo;

/**
 * Created by 峰 on 16:28
 */
public class NdkJniUtils {

    static {
        //在build.gradle中设置moduleName
        //defaultConfig.ndk.moduleName
        System.loadLibrary("YanboberJniLibName");
    }

    public native String getCLanguageString();
}
