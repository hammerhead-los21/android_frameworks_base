/*
 * Copyright (C) 2023 The Android Open Source Project
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
package com.android.hoststubgen.test.tinyframework;

import android.hosttest.annotation.HostSideTestWholeClassStub;

import java.util.HashSet;
import java.util.Set;

@HostSideTestWholeClassStub
public class TinyFrameworkClassLoadHook {
    private TinyFrameworkClassLoadHook() {
    }

    public static final Set<Class<?>> sLoadedClasses = new HashSet<>();

    public static void onClassLoaded(Class<?> clazz) {
        sLoadedClasses.add(clazz);
    }
}
