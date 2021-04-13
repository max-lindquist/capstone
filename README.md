# Capstone
Code base for Capstone project and experimentation

Built using Google Maps Android Samples (from https://github.com/googlemaps/android-samples)

## Setup Instructions
1. Download and install Android Studio (https://developer.android.com/studio/index.html)
2. Add the Google Play services package to Android Studio
    1. Open Android Studio
    2. Click Tools > SDK Manager
    3. In the SDK Manager, click Appearance & Behavior > System Settings > Android SDK
    4. Under SDK Tools, check the box "Google Play services"
    5. Click "OK"
3. Download or clone this repository
4. Open the SampleGPSApp in Android Studio
    1. In Android Studio, File > Open, then select the project
    2. Our Sample GPS applicaiton is in the folder **SampleGPSApp**
5. Create and add a local API Key
    1. Obtain a Google API key that's authorized to use the Maps SDK from https://console.cloud.google.com/google/maps-apis/overview?project=gothic-sequence-309818&folder=&organizationId=
    2. Add API key to your app
        1. In local.properties, replace YOUR_API_KEY with your obtained API key on line 
6. Build and Run App
    1. Configure a virtual device if one has not been already
        1. Any existing devices can be seen in Tools > AVD Manager
        2. If no devices are configured, select **Create Virtual Device** to create a new one. Currently, I am using the Pixel 3a API 30
        3. In the AVD Manager, select the green triangle to begin running the emulator
    2. Click Run > Run 'app' to begin running the application
