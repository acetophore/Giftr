package io.github.joshkergan.giftr;

import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by Josh on 16/10/2016.
 * Stub Activity for working with People Activity
 */
public class ItemsActivityStub extends GiftrActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        attachView(R.layout.test);
    }
}
