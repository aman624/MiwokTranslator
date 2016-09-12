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
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView numbersTextView;
    private TextView familyTextView;
    private TextView colorsTextView;
    private TextView phrasesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        numbersTextView = (TextView) findViewById(R.id.numbers);
        familyTextView = (TextView) findViewById(R.id.family);
        colorsTextView = (TextView) findViewById(R.id.colors);
        phrasesTextView = (TextView) findViewById(R.id.phrases);

        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(NumbersActivity.class);
            }
        });

        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(FamilyActivity.class);
            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(ColorsActivity.class);
            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(PhrasesActivity.class);
            }
        });
    }

    public void start(Class cl) {
        Intent intent = new Intent(this, cl);
        startActivity(intent);
    }
}
