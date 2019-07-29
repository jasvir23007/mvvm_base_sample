package com.rockmvvm.rockbasemvvm.data

import com.rockmvvm.rockbasemvvm.data.local.db.DbHelper
import com.rockmvvm.rockbasemvvm.data.remote.ApiHelper

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
interface DataManager : DbHelper, ApiHelper {

    //fun doPostsApiCall(): Observable<List<Post>>
}