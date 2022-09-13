package com.example.moviemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.moviemo.extension.showSnackBar
import com.example.presentation.viewModel.BaseViewModel
import timber.log.Timber

abstract class BaseFragment : Fragment() {


    protected open fun handleErrorMessage(message: String?) {
        if (message.isNullOrBlank()) return
        Timber.e(message)
        view?.let {
            showSnackBar(it, message)
        }

    }


}