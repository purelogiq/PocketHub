/*
 * Copyright (c) 2015 PocketHub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pockethub.android.ui.user;

import com.github.pockethub.android.R;


/**
 * Fragment to display a list of followers
 */
public abstract class FollowersFragment extends PagedUserFragment {

    @Override
    protected int getEmptyText() {
        return R.string.no_followers;
    }

    @Override
    protected int getLoadingMessage() {
        return R.string.loading_followers;
    }

    @Override
    protected int getErrorMessage() {
        return R.string.error_followers_load;
    }
}
