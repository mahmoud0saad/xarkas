package com.mahmoudsaad.xarkas.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import androidx.core.text.TextUtilsCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.mahmoudsaad.xarkas.R;
import com.mahmoudsaad.xarkas.ui.base.BaseActivity;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
public class CommonUtils {
    private CommonUtils() {
        // This utility class is not publicly instantiable
    }

    public static ProgressDialog showLoadingDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.show();
        if (progressDialog.getWindow() != null) {
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }

    @SuppressLint("HardwareIds")
    public static String getDeviceId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    public static String formatMonth(int month, String locale) {
        DateFormat formatter = new SimpleDateFormat("LLL", Locale.forLanguageTag(locale));
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.MONTH, month - 1);
        return formatter.format(calendar.getTime());
    }

    public static boolean isValidPhoneNumber(String phone) {
        if (!phone.trim().equals("") && phone.length() > 7) {
            return Patterns.PHONE.matcher(phone).matches();
        }

        return false;
    }

    public static boolean isEmailValid(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void startNavigationMap(Activity activity, String latitude, String longitude) {
        if (latitude == null || TextUtils.isEmpty(latitude) || longitude == null || TextUtils.isEmpty(longitude)) {
            ((BaseActivity) activity).showMessage(activity.getResources().getString(R.string.not_location_available));
            return;
        }

        Uri uri = Uri.parse("http://maps.google.com/maps?daddr=" + Double.valueOf(latitude) + "," + Double.valueOf(longitude));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        mapIntent.setPackage("com.google.android.apps.maps");
        activity.startActivity(mapIntent);
    }



    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == View.LAYOUT_DIRECTION_RTL;
    }

    public static Context getLanguageAwareContext(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        Locale locale;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        return context.createConfigurationContext(configuration);
    }
}
