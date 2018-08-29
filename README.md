# Introduction
[android.widget.SlidingDrawer](http://developer.android.com/reference/android/widget/SlidingDrawer.html) was deprecated in API level 17.

This is a fork of https://github.com/wtao901231/SlidingDrawer with some extended capabilities and is now consumable.

## How to consume
See [bintray](https://bintray.com/xni0601/maven/sliding-drawer)

## Upload to bintray
Update `version` element within `upload.gradle`
```
./gradlew clean slider-drawer:build install
./gradlew bintrayUpload
```
For further information, please see [How to distribute Android library in a convenient way](https://android.jlelse.eu/how-to-distribute-android-library-in-a-convenient-way-d43fb68304a7)

# License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
