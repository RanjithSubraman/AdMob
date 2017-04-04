<h1>Using AdMob feature in android applications</h1>

What is AdMob? https://www.google.com/admob/

How does AdMob work? https://www.youtube.com/watch?v=cN7nfCENzzE

I hope, you got the basic understanding about AdMob, Now I am going explain how we can integrate this feature into a mobile app. Before starting this implementation, we should get to know about the type of Ads which we can display.

I hope, you got the basic understanding about AdMob, Now I am going explain how we can integrate this feature into a mobile app. Before starting this implementation, we should get to know about the type of Ads which we can display.

<b>Banner Ads:</b> Basically it is used to show an ad in a small portion of the application while we are using other UIs like activity/Fragment, also it won't interrupt a user's flow because it is always displayed the bottom of a particular app screen.

<b>Interstitial Ads:</b> Basically it's used to display ads on the whole screen of the application for a certain time period with a close button. The particular app developer should decide when it should be displayed while users accessing the application.

<b>Native Ads:</b> It was recently introduced by Google. ( We are not gonna cover this kind of ad implementation in this post)
Native apps can be divided into two categories

<b>App installs native apps:</b> It will show the relevant application for ads.
Content native apps.

Step 1: Create an empty or bank activity android project in Android Studio

Step 2: Specify all require permission in AndroidManifest.xml
<pre lang='xml'>
    &lt;uses-permission android:name="android.permission.INTERNET" &gt;
    &lt;uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" &gt;
</pre>
Step 3: Specify the Google play service library in build.gradle(Module.app) and sync the project.
<pre lang='java'>
    dependencies {
      compile 'com.google.android.gms:play-services:8.3.0'
    }
</pre>
Step 4:  XML implementation in your layout.xml file, This is used to show banner ads.
<pre lang="xml">
    &lt;com.google.android.gms.ads.AdView 
    android:id="@+id/adView" 
    android:layout_width="match_parent" 
    android:layout_height="wrap_content" 
    android:layout_alignParentBottom="true" 
    android:layout_alignParentLeft="true" 
    ads:adSize="BANNER" 
    ads:adUnitId="ca-app-pub-3940256099942544/6300978111"&gt;
</pre>
The adUnitId is a unique id to identify your account, Here I am using test adUnitId for my development purpose.
