package com.openaura.test;

import com.openaura.Artists;
import com.openaura.Openaura;
import com.openaura.OpenauraApi;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Zygimantus
 */
public class OpenauraApiTests {

    private final String API_KEY = "";

    @Test
    public void oneTest() throws IOException {

        OpenauraApi.init();
        Openaura api = OpenauraApi.getApi();

        Call<List<Artists>> artists = api.searchArtists("Mamontovas", API_KEY);

        Response<List<Artists>> response = artists.execute();

        if (response.body() != null) {

            List<Artists> body = response.body();

            Artists artist = body.get(0);

            Assert.assertEquals("663b0be4-8e49-4ca9-b771-58e169e4e628", artist.getMusicbrainzId());
        }
    }
}
