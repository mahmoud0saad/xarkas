package com.mahmoudsaad.xarkas.data.network.watson;

import android.util.Base64;

import com.mahmoudsaad.xarkas.data.network.pojo.chatbot.WatsonRequest;
import com.mahmoudsaad.xarkas.data.network.pojo.chatbot.WatsonResponse;

import java.util.Locale;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created By Mohamed El Banna On 4/3/2020
 **/

public class WatsonClient {
    private static final String BASE_URL = "https://api.eu-gb.assistant.watson.cloud.ibm.com/instances/0f3156f1-c501-4d4b-b562-bffc15caae51/v1/workspaces/";
    private static WatsonClient INSTANCE;
    private final String SelectedLanguage = getSelectedLanguage();
    String baseAuth = "apikey" + ":" + "rj0tYNAsBZViBKlTWdmzfNlcVE2OouJuHD8wCRWMoqfs";
    String apiKey = Base64.encodeToString(baseAuth.getBytes(), Base64.NO_WRAP);
    String authorization = "Basic " + apiKey;
    private WatsonService mService;

    public WatsonClient() {
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL + SelectedLanguage)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mService = mRetrofit.create(WatsonService.class);
    }

    public static WatsonClient getInstance() {
        if (INSTANCE == null)
            INSTANCE = new WatsonClient();
        return INSTANCE;
    }

    public Call<WatsonResponse> getBotReplay(WatsonRequest mRequest) {
        return mService.getBotReplay(authorization, "2020-04-01", mRequest);
    }

    String getSelectedLanguage() {
        final String SKILL_AR = "5c5f025a-67d1-4d3f-98a1-c4c97cdca75b/";
        final String SKILL_EN = "0d851d83-6d53-44d3-a3f3-1d793bea4868/";
        if (Locale.getDefault().getLanguage().equalsIgnoreCase("en")) {
//            return SKILL_EN;
            return SKILL_AR;
        } else return SKILL_AR;

    }

}
