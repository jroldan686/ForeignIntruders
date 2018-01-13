package jroldan.foreignintruders.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import jroldan.foreignintruders.data.db.model.User;

/**
 * Created by jesus on 12/01/18.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }
}
