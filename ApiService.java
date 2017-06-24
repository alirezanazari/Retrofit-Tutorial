package app.news.jahesh.retrofitlearning;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Alireza on 6/24/17.
 */
public interface ApiService {

    @GET("get_lastSongs.php")
    Call<LastSongModel> getLastSong();


}
