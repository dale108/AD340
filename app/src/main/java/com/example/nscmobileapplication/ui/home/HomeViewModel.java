package com.example.nscmobileapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("My name is Dale, and I was born and raised in Seattle");
    }

    public LiveData<String> getText() {
        return mText;
    }
}