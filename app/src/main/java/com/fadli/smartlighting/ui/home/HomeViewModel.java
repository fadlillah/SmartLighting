package com.fadli.smartlighting.ui.home;

import android.widget.ListView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.fadli.smartlighting.id_lamp;

import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private ArrayList<String> id_lamps;
    private String[] data = {"Lamp 1","Lamp 2"};
    private ListView lists;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Monitoring fragment");

    }
    public LiveData<String> getText() {
        return mText;
    }

}