package com.example.koszykowka;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private MutableLiveData punkty;

    public MutableLiveData<Integer> getPunkty() {
        if(punkty == null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        return punkty;
    }

    public void setPunkty(MutableLiveData punkty) {
        if(punkty == null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        this.punkty = punkty;
    }

    public  void addPunkty(int p){
        int aktualnepunkty = getPunkty().getValue();
        punkty.setValue(0);
    }
}
