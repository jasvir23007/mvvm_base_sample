package com.rockmvvm.rockbasemvvm.data.remote

import com.rockmvvm.rockbasemvvm.data.model.Post
import io.reactivex.Observable

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
interface ApiHelper {

    fun doPostsApiCall(): Observable<List<Post>>
}