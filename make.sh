#!/usr/bin/env bash
./gradlew clean assemblePlugin
adb push app/build/outputs/apk/plugin/release /sdcard/test
adb shell am force-stop com.didi.virtualapk
adb shell am start -n com.didi.virtualapk/com.didi.virtualapk.MainActivity