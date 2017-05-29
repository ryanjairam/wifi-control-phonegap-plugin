# Wifi control Phonegap plugin (Android Only)

# 1. Description
---
A plugin for turning Wifi on / off in Phonegap apps targeting Android devices.

# 2. Installation from GitHub
`$ phonegap plugin add https://github.com/RyanJairam/wifi-control-phonegap-plugin`

# 3. Usage
1. Add the CHANGE_WIFI_STATE permission to /platforms/Android/AndroidManifest.xml  
```xml
<uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
```

2. Examples
__Turn Wifi off__
```javascript
 window.WifiControlPlugin.setWifi('off', function(){ 
    // success
 },
 function(){
    // error
 });
```

__Turn Wifi on__
```javascript
 window.WifiControlPlugin.setWifi('on', function(){ 
    // success
 },
 function(){
    // error
 });
```
