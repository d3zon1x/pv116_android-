package com.example.init_app.network;


import com.example.init_app.dto.category.CategoryItemDTO;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface CategoriesApi {
    @GET("/api/CategoryControllers/CategoryGetAsync")
    public Call<List<CategoryItemDTO>> list();

    @Multipart
    @POST("/api/category/createcategory")
    public Call<CategoryItemDTO> create(@PartMap Map<String, RequestBody> params,
                                        @Part MultipartBody.Part image);
}
