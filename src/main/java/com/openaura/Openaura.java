package com.openaura;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 *
 * @author Zygimantus
 */
public interface Openaura {

    @GET("search/artists")
    Call<List<Artists>> searchArtists(@Query("q") String query, @Query("api_key") String apiKey);
}
