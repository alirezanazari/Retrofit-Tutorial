package app.news.jahesh.retrofitlearning;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiService apis ;
    RetrofitSetting retrofit ;
    ProgressDialog pd ;

    TextView txt ;
    List<LastSongModel.data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        txt = (TextView) findViewById(R.id.txt);

        //server config
        retrofit = new RetrofitSetting();
        apis = retrofit.getApiService();

        pd = new ProgressDialog(this);
        pd.setMessage("please wait");
        pd.show();

        Call<LastSongModel> call = apis.getLastSong();
        call.enqueue(new Callback<LastSongModel>() {
            @Override
            public void onResponse(Call<LastSongModel> call, Response<LastSongModel> response) {
                pd.dismiss();
                if (response.isSuccessful()){

                    LastSongModel model = response.body();
                    txt.setText("song name" + " : " + model.getData().get(0).getSong_name());
                    list = model.getData() ;

                }else {
                    Log.e("error" , response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<LastSongModel> call, Throwable t) {
                pd.dismiss();
                t.printStackTrace();
            }
        });
    }
}
