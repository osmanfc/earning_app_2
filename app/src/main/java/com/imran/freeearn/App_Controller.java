package com.imran.freeearn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class App_Controller {

    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @SuppressLint("CommitPrefEdits")
    public App_Controller(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("App_Controller",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    public  void setDate(int date){
        editor.putInt("date",date);
        editor.commit();
    }
    public int getDate(){
        int date = sharedPreferences.getInt("date",0);
        return date;
    }


    public  void setColorCode(String colorCode1,String colorCode2 ){
        editor.putString("colorCode1",colorCode1);
        editor.putString("colorCode2",colorCode2);
        editor.commit();
    }
    public String getColorCode1(){
        String colorCode1;
        colorCode1 = sharedPreferences.getString("colorCode1","#0ecc6d");
        return colorCode1;
    }

    public String getColorCode2(){
        String colorCode2;
        colorCode2 = sharedPreferences.getString("colorCode2","#0aa155");
        return colorCode2;
    }


    public void dataStore (String spin_limit ,String daliy_task_limit, String spin1_control, String spin_waitingTime){
        editor.putString("spin_limit",spin_limit);
        editor.putString("daily_task_limit",daliy_task_limit);
        editor.putString("spin_control",spin1_control);

        editor.putString("spin_waitingTime",spin_waitingTime);
        editor.commit();
    }




    public String getSpinWaitingTime (){
        String spin_waitingTime = sharedPreferences.getString("spin_waitingTime","0");
        return spin_waitingTime;
    }


    public String getSpin_limit (){
        String spin_limit = sharedPreferences.getString("spin_limit","0");
        return spin_limit;
    }
    public String getDaliy_task_limit (){
        String daliy_task_limit = sharedPreferences.getString("daily_task_limit","0");
        return daliy_task_limit;
    }

    public String getSpin1_control (){
        String spin1_control = sharedPreferences.getString("spin_control","");
        return spin1_control;
    }



    public  void spin1DailyTaskCounter(int value){
        editor.putInt("taskCounter",value);
        editor.commit();
    }
    public int getSpin1DailyTaskCounter1(){
        int taskCounter = sharedPreferences.getInt("taskCounter",0);
        return taskCounter;
    }

    public  void spin1DailyTaskLimitCounter(int value){
        editor.putInt("taskLimitCounter",value);
        editor.commit();
    }
    public int getSpin1DailyTaskLimitCounter1(){
        int taskCounter = sharedPreferences.getInt("taskLimitCounter",0);
        return taskCounter;
    }
    //srcreator
    public void setSuccessImpressionCount(int count) {
        editor.putInt("TaskApi", count);
        editor.apply();
    }
    public int getSuccessImpressionCount() {
        int date;
        date = sharedPreferences.getInt("TaskApi", 0);
        return date;
    }

    public  void setLuckySpinDailyTaskCounter(int value){
        editor.putInt("luckSpinCounter",value);
        editor.commit();
    }
    public int getLuckySpinDailyTaskCounter1(){
        int taskCounter = sharedPreferences.getInt("luckSpinCounter",0);
        return taskCounter;
    }

    public  void setLuckySpinDailyTaskLimitCounter(int value){
        editor.putInt("luckSpinLimitCounter",value);
        editor.commit();
    }
    public int getLuckySpinTaskLimitCounter1(){
        int taskCounter = sharedPreferences.getInt("luckSpinLimitCounter",0);
        return taskCounter;
    }




}
/*
package com.srcreator.hypercash;

        import android.annotation.SuppressLint;
        import android.content.Context;
        import android.content.SharedPreferences;

        import androidx.security.crypto.EncryptedSharedPreferences;
        import androidx.security.crypto.MasterKeys;

        import java.io.IOException;
        import java.security.GeneralSecurityException;

public class App_Controller {

    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    public static final char DOT = '.';

    @SuppressLint("CommitPrefEdits")
    public App_Controller(Context context) {
        this.context = context;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            try {
                String masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC);
                sharedPreferences = EncryptedSharedPreferences.create(
                        "secret_shared_prefs",
                        masterKeyAlias,
                        context,
                        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
                );
                editor = sharedPreferences.edit();
            } catch (GeneralSecurityException | IOException e) {
                e.printStackTrace();
            }
        }
    }//srcreator
//srcreator
    public void setSuccessImpressionCount(int count) {
        editor.putInt("TaskApi", count);
        editor.apply();
    }

    public int getSuccessImpressionCount() {
        int date;
        date = sharedPreferences.getInt("TaskApi", 0);
        return date;
    }


    public void setDate(int date) {
        editor.putInt("date", date);
        editor.commit();
    }



}
*/
