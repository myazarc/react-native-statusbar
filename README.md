Now only support Android.
os Version>=21 running. 
os Version <21 doNothing.

---------------------
Coming Soon
-----------------

 - Statusbar show/hide
 - ios?

Installation
-------------
```
npm i --save react-native-statusbar
rnpm link react-native-statusbar
```
MainApplication.java
```

import com.myazarc.mycstatusbar.MYCStatusbarPackage;
//...
protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new MYCStatusbarPackage()
      );
    }
```

----------
Usage
--------
```
import MYCStatusbar from 'react-native-statusbar';
MYCStatusbar.setColor('#0095FF');
```
----

