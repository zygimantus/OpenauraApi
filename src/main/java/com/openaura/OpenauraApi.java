package com.openaura;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author Zygimantus
 */
public class OpenauraApi {

    private Openaura openaura;
    private static OpenauraApi openauraApi;

    public OpenauraApi() {

        // http://api.openaura.com/v1/search/artists?q=Mamontovas&api_key=1d9ea39e70e3476140c180593a2ae5bd44b65f12
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openaura.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        openaura = retrofit.create(Openaura.class);
    }

    public static void init() {
        openauraApi = new OpenauraApi();
    }

    public static Openaura getApi() {
        return openauraApi.openaura;
    }

    public void setApi(Openaura openaura) {
        openauraApi.openaura = openaura;
    }

}
