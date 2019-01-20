package com.example.maxdo.dagger2sample.dagger.appComponent

import com.example.maxdo.dagger2sample.entities.Comment
import com.example.maxdo.dagger2sample.entities.Post
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("/posts")
    fun getPosts(): Deferred<List<Post>>

    @GET("/posts")
    fun getPostsByUserId(@Query("userId") userId: Int)

    @GET("/posts/{postId}")
    fun getPostById(@Path("postId") postId: Int): Deferred<Post>

    @GET("/comments")
    fun getCommentsByPostId(@Query("postId") postId: Int): Deferred<List<Comment>>
}