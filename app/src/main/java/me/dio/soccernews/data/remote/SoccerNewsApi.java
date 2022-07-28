package me.dio.soccernews.data.remote;



import java.util.List;

import me.dio.soccernews.doman.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SoccerNewsApi {
    @GET("news.json")
    Call<List<News>> getNews();
}