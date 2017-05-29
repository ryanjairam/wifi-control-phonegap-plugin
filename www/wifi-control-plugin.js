
var exec = require('cordova/exec');

var PLUGIN_NAME = 'WifiControlPlugin';

var WifiControlPlugin = {
  setWifi: function(state, successCallback, errorCallback) {
    successCallback = (typeof successCallback === 'undefined' || typeof successCallback !== 'function') ? null : successCallback;
    errorCallback = (typeof errorCallback === 'undefined' || typeof errorCallback !== 'function') ? null : errorCallback;
    exec(successCallback, errorCallback, PLUGIN_NAME, 'setWifi', [state]);
  }
};

module.exports = WifiControlPlugin;
