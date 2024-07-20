package com.learnium.RNDeviceInfo;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class NativeRNDeviceInfoAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
  public static final String NAME = "RNDeviceInfo";

  public NativeRNDeviceInfoAndroidSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  protected abstract Map<String, Object> getTypedExportedConstants();

  @Override
  @DoNotStrip
  public final @Nullable Map<String, Object> getConstants() {
    Map<String, Object> constants = getTypedExportedConstants();
    if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
      Set<String> obligatoryFlowConstants = new HashSet<>(Arrays.asList(
          "appName",
          "appVersion",
          "brand",
          "buildNumber",
          "bundleId",
          "deviceId",
          "deviceType",
          "isLowRamDevice",
          "isTablet",
          "model",
          "systemName",
          "systemVersion"
      ));
      Set<String> optionalFlowConstants = new HashSet<>();
      Set<String> undeclaredConstants = new HashSet<>(constants.keySet());
      undeclaredConstants.removeAll(obligatoryFlowConstants);
      undeclaredConstants.removeAll(optionalFlowConstants);
      if (!undeclaredConstants.isEmpty()) {
        throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", undeclaredConstants));
      }
      undeclaredConstants = obligatoryFlowConstants;
      undeclaredConstants.removeAll(constants.keySet());
      if (!undeclaredConstants.isEmpty()) {
        throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", undeclaredConstants));
      }
    }
    return constants;
  }

  @ReactMethod
  @DoNotStrip
  public abstract void getAndroidId(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getAndroidIdSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getApiLevel(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getApiLevelSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getAvailableLocationProviders(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getAvailableLocationProvidersSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getBaseOs(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getBaseOsSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getBatteryLevel(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getBatteryLevelSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getBootloader(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getBootloaderSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getBuildId(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getBuildIdSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getCarrier(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getCarrierSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getCodename(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getCodenameSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getDevice(Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void getDeviceName(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getDeviceNameSync();

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getDeviceSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getDisplay(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getDisplaySync();

  @ReactMethod
  @DoNotStrip
  public abstract void getFingerprint(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getFingerprintSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getFirstInstallTime(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getFirstInstallTimeSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getFontScale(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getFontScaleSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getFreeDiskStorage(Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void getFreeDiskStorageOld(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getFreeDiskStorageSync();

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getFreeDiskStorageOldSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getHardware(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getHardwareSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getHost(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getHostSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getIncremental(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getIncrementalSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getInstallerPackageName(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getInstallerPackageNameSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getInstallReferrer(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getInstallReferrerSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getInstanceId(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getInstanceIdSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getIpAddress(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getIpAddressSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getLastUpdateTime(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getLastUpdateTimeSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getMacAddress(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getMacAddressSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getMaxMemory(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getMaxMemorySync();

  @ReactMethod
  @DoNotStrip
  public abstract void getPreviewSdkInt(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getPreviewSdkIntSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getProduct(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getProductSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getSecurityPatch(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getSecurityPatchSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getSerialNumber(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getSerialNumberSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getSystemAvailableFeatures(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableArray getSystemAvailableFeaturesSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getTags(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getTagsSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getTotalDiskCapacity(Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void getTotalDiskCapacityOld(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getTotalDiskCapacitySync();

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getTotalDiskCapacityOldSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getTotalMemory(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getTotalMemorySync();

  @ReactMethod
  @DoNotStrip
  public abstract void getType(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getTypeSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getUniqueId(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getUniqueIdSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getUsedMemory(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getUsedMemorySync();

  @ReactMethod
  @DoNotStrip
  public abstract void getUserAgent(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getUserAgentSync();

  @ReactMethod
  @DoNotStrip
  public abstract void hasGms(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean hasGmsSync();

  @ReactMethod
  @DoNotStrip
  public abstract void hasHms(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean hasHmsSync();

  @ReactMethod
  @DoNotStrip
  public abstract void hasSystemFeature(String feature, Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean hasSystemFeatureSync(String feature);

  @ReactMethod
  @DoNotStrip
  public abstract void isAirplaneMode(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isAirplaneModeSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isBatteryCharging(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isBatteryChargingSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isCameraPresent(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isCameraPresentSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isEmulator(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isEmulatorSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isHeadphonesConnected(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isHeadphonesConnectedSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isLocationEnabled(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isLocationEnabledSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isPinOrFingerprintSet(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isPinOrFingerprintSetSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isWiredHeadphonesConnected(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isWiredHeadphonesConnectedSync();

  @ReactMethod
  @DoNotStrip
  public abstract void isBluetoothHeadphonesConnected(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isBluetoothHeadphonesConnectedSync();

  @ReactMethod
  @DoNotStrip
  public abstract void syncUniqueId(Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void getSupportedMediaTypeList(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableArray getSupportedMediaTypeListSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getPowerState(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getPowerStateSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getSupported32BitAbis(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableArray getSupported32BitAbisSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getSupported64BitAbis(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableArray getSupported64BitAbisSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getSupportedAbis(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableArray getSupportedAbisSync();

  @ReactMethod
  @DoNotStrip
  public abstract void getSystemManufacturer(Promise promise);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract String getSystemManufacturerSync();

  @ReactMethod
  @DoNotStrip
  public abstract void addListener(String eventName);

  @ReactMethod
  @DoNotStrip
  public abstract void removeListeners(double count);
}
