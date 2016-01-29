package lv.bizapps.databindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {
    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
}
