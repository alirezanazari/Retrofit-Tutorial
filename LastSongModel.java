package app.news.jahesh.retrofitlearning;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Alireza on 6/24/17.
 */
public class LastSongModel {


    private List<data> data = null;


    public class data{

        @SerializedName("song_id")
        @Expose
        private String song_id ;

        @SerializedName("song_name")
        @Expose
        private String song_name ;

        @SerializedName("song_artist")
        @Expose
        private String song_artist ;

        @SerializedName("song_artistCode")
        @Expose
        private String song_artistCode ;

        @SerializedName("song_link")
        @Expose
        private String song_link ;

        @SerializedName("song_picture")
        @Expose
        private String song_picture ;

        @SerializedName("song_genre")
        @Expose
        private String song_genre ;

        @SerializedName("song_genreID")
        @Expose
        private String song_genreID ;

        @SerializedName("song_cermoney")
        @Expose
        private String song_cermoney ;

        @SerializedName("song_cermonyID")
        @Expose
        private String song_cermonyID ;

        @SerializedName("song_isBest")
        @Expose
        private String song_isBest ;

        //getter

        public String getSong_id() {
            return song_id;
        }

        public String getSong_name() {
            return song_name;
        }

        public String getSong_artist() {
            return song_artist;
        }

        public String getSong_artistCode() {
            return song_artistCode;
        }

        public String getSong_link() {
            return song_link;
        }

        public String getSong_picture() {
            return song_picture;
        }

        public String getSong_genre() {
            return song_genre;
        }

        public String getSong_genreID() {
            return song_genreID;
        }

        public String getSong_cermoney() {
            return song_cermoney;
        }

        public String getSong_cermonyID() {
            return song_cermonyID;
        }

        public String getSong_isBest() {
            return song_isBest;
        }

        //setter

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public void setSong_name(String song_name) {
            this.song_name = song_name;
        }

        public void setSong_artist(String song_artist) {
            this.song_artist = song_artist;
        }

        public void setSong_artistCode(String song_artistCode) {
            this.song_artistCode = song_artistCode;
        }

        public void setSong_link(String song_link) {
            this.song_link = song_link;
        }

        public void setSong_picture(String song_picture) {
            this.song_picture = song_picture;
        }

        public void setSong_genre(String song_genre) {
            this.song_genre = song_genre;
        }

        public void setSong_genreID(String song_genreID) {
            this.song_genreID = song_genreID;
        }

        public void setSong_cermoney(String song_cermoney) {
            this.song_cermoney = song_cermoney;
        }

        public void setSong_cermonyID(String song_cermonyID) {
            this.song_cermonyID = song_cermonyID;
        }

        public void setSong_isBest(String song_isBest) {
            this.song_isBest = song_isBest;
        }
    }

    public List<data> getData(){
        return data ;
    }

}