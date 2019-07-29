package com.rockmvvm.rockbasemvvm

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.rockmvvm.rockbasemvvm.data.DataManager
import com.rockmvvm.rockbasemvvm.ui.post.PostListViewModel
import com.rockmvvm.rockbasemvvm.util.rx.SchedulerProvider
import javax.inject.Inject
import javax.inject.Singleton

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/

@Singleton
class ViewModelFactory
@Inject constructor(
    private val mDataManager: DataManager,
    private val mSchedulerProvider: SchedulerProvider
) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PostListViewModel(mDataManager, mSchedulerProvider) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class") as Throwable
    }
}