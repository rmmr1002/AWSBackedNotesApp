## AWSBackedNotesApp

This is an app that creates notes, along with the following features. It uses the Amplify SDK from AWS: 
<ul>
  <li> Analytics so you can view demographic information about your users.</li>
  <li> sign-in/sign-up flow for authentication. </li>
  <li> Access data stores in the AWS cloud, so that a user's notes are available to them on any device with the app installed. </li>
</ul>


Use https://github.com/amazon-archives/aws-mobile-android-notes-tutorial/blob/master/tutorial/ as a reference if needed. 

## Getting Started 
Before you begin, do the following:
<ol>
  <li>Complete the Getting Started instructions to install the Amplify CLI.</li>
  <li>Download and install Android Studio version 3.0.1 or later.</li>
  <li>Download and install Android SDK version 8.0 (Oreo), API level 26.</li>
<li>Install an Android Emulator. The app works with both phone and tablet emulators (for example, the Nexus 5X or Pixel C).</li>
</ol>

## Running the Application
<ol>
  <li> Clone the repo </li>
  <li> Use Amplify CLI to configure AWS resources as mentioned in the tutorial </li>
  <li> Open project with Android Studio </li>
  <li> Build project and run </li>
 </ol>
 The app should look something like
 <br>
 <img src="https://github.com/rmmr1002/AWSBackedNotesApp/blob/master/note.png" alt="alt text" width="200" height="400" style="vertical-align:middle">

 ## Analytics
 The app uses AWS Pinpoint to track usage data for the app. 
 ![Image of Analytics](https://github.com/rmmr1002/AWSBackedNotesApp/blob/master/analytics.png)
 
  ## Authentication
 The app uses AWS Cognito to manage users
 <br> 
 <img src="https://github.com/rmmr1002/AWSBackedNotesApp/blob/master/login.png" alt="alt text" width="200" height="400" style="vertical-align:middle">
 
  ## Authentication
 The app uses AWS AppSync to manage user data
 ![Image of DB](https://github.com/rmmr1002/AWSBackedNotesApp/blob/master/db.png)
 

## License Summary

This sample code is made available under a modified MIT license. See the [LICENSE](./LICENSE) file.
