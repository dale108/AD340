package com.example.nscmobileapplication.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("I love making homemade pasta and ice cream. My latest" +
                " invention was a tahini ice cream with honey roasted peanuts.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}