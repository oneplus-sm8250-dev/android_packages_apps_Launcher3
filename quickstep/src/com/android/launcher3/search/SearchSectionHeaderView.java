/*
 * Copyright (C) 2020 The Android Open Source Project
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
package com.android.launcher3.search;

import android.app.search.SearchTarget;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.List;

/**
 * Header text view that shows a title for a given section in All apps search
 */
public class SearchSectionHeaderView extends TextView implements SearchTargetHandler {

    public SearchSectionHeaderView(Context context) {
        super(context);
    }

    public SearchSectionHeaderView(Context context,
            @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SearchSectionHeaderView(Context context, @Nullable AttributeSet attrs, int styleAttr) {
        super(context, attrs, styleAttr);
    }

    @Override
    public void apply(SearchTarget parentTarget, List<SearchTarget> children) {
        setText(parentTarget.getSearchAction().getTitle());
        setVisibility(VISIBLE);
    }

    @Override
    public void onClick(View view) {
        // do nothing.
    }

    @Override
    public boolean onLongClick(View view) {
        // do nothing.
        return false;
    }
}