/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Elementi> earthquakes = new ArrayList<>();
        earthquakes.add(3.5,"San Francisco", "23/11/2017");
        earthquakes.add(3.5,"London", "23/11/2017");
        earthquakes.add(3.5,"Tokyo", "23/11/2017");
        earthquakes.add(3.5,"Mexico City", "23/11/2017");
        earthquakes.add(3.5,"Moscow", "23/11/2017");
        earthquakes.add(3.5,"Rio de Janeiro", "23/11/2017");
        earthquakes.add(3.5,"Paris", "23/11/2017");

        MyAdapter itemsAdapter = new MyAdapter ( this, earthquakes );
        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        earthquakeListView.setAdapter ( itemsAdapter );
    }
}
