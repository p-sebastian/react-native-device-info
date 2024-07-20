import { Platform } from 'react-native';
import RNDeviceInfoIOS from '../NativeRNDeviceInfoAndroid';
import RNDeviceInfoAndroid from '../NativeRNDeviceInfoAndroid';
import { DeviceInfoNativeModule } from './privateTypes';

let RNDeviceInfo;
if (Platform.OS === 'ios') {
  RNDeviceInfo = RNDeviceInfoIOS;
} else if (Platform.OS === 'android') {
  RNDeviceInfo = RNDeviceInfoAndroid;
}

// @ts-ignore
if (Platform.OS === 'web' || Platform.OS === 'dom') {
  RNDeviceInfo = require('../web');
}

if (!RNDeviceInfo) {
  // Produce an error if we don't have the native module
  if (
    Platform.OS === 'android' ||
    Platform.OS === 'ios' ||
    Platform.OS === 'web' ||
    // @ts-ignore
    Platform.OS === 'dom'
  ) {
    throw new Error(`react-native-device-info: RNDeviceInfo has not been linked. To fix this issue:
  • Run \`pod install\` in the \`ios\` directory and then rebuild and re-run the app. You may also need to re-open Xcode to get the new pods.
  If this does not fix the issue, please open an issue on the Github repository: https://github.com/react-native-device-info/react-native-device-info`);
  }
}

export default RNDeviceInfo as DeviceInfoNativeModule;
