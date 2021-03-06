/*
 *   Copyright (c) 2019 Google Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License. You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under the License
 *
 *   is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *   or implied. See the License for the specific language governing permissions and limitations under
 *   the License.
 */

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies{
        // Wait to move to 3.6 until ConstraintLayout related attribute bugs are resolved. See
        // https://issuetracker.google.com/issues/138601946 for more details.
        classpath(ProjectSetup.buildToolsClassPath)
        classpath(ProjectSetup.kotlinGradleClassPath)
        classpath(ProjectSetup.navSafeArgsClassPath)
        classpath(ProjectSetup.googleServicesClassPath)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register(ProjectSetup.clean, Delete::class) {
    delete(rootProject.buildDir)
}