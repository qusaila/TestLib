package com.example.hash_techs_helpers;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Utils {


    public static void errorSweetDialog(Activity activity,String msg){
        SweetAlertDialog pDialog = new SweetAlertDialog(activity, SweetAlertDialog.ERROR_TYPE);
        pDialog.setTitleText(msg);
        pDialog.setCancelable(false);
        pDialog.setConfirmText("موافق");
        pDialog.show();
        new Utils().changeDialogfont(pDialog, activity);
    }
    public static void waringSweetDialog(Activity activity,String msg){
        SweetAlertDialog pDialog = new SweetAlertDialog(activity, SweetAlertDialog.WARNING_TYPE);
        pDialog.setTitleText(msg);
        pDialog.setCancelable(false);
        pDialog.setConfirmText("موافق");
        pDialog.show();
        new Utils().changeDialogfont(pDialog, activity);
    }
    public static void sucessSweetDialog(Activity activity,String msg){
        SweetAlertDialog pDialog = new SweetAlertDialog(activity, SweetAlertDialog.SUCCESS_TYPE);
        pDialog.setTitleText(msg);
        pDialog.setCancelable(false);
        pDialog.setConfirmText("موافق");
        pDialog.show();
        new Utils().changeDialogfont(pDialog, activity);
    }
    public void changeDialogfont(SweetAlertDialog pDialog, Context context) {
        TextView text = (TextView) pDialog.findViewById(R.id.title_text);
        TextView textconfirm = (TextView) pDialog.findViewById(R.id.content_text);
        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "fonts/Cairo-Regular.ttf");
        text.setTypeface(tf);
        textconfirm.setTypeface(tf);
        Button btn = (Button) pDialog.findViewById(R.id.confirm_button);
        Button btncanel = (Button) pDialog.findViewById(R.id.cancel_button);
        btn.setTypeface(tf);
        btncanel.setTypeface(tf);
    }
}
