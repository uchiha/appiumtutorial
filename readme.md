[10052018]: This code is for the Appium Tutorial
1. at this point, setup was done in my PC and we can invoke appium server and run this simple code.
2. you can checkout the devices connected in your PC by: adb devices
3. invoke android emulator by going in: C:\Users\ClarencioTan\AppData\Local\Android\Sdk\platform-tools
   and running: emulator -avd Nexus_5_API_24_1
   Note the emulator name can be found by command #2.
4. this project does not use maven nor test unit framwork yet.
5. to run UIAutomator: C:\Users\ClarencioTan\AppData\Local\Android\Sdk\tools\bin

[15052018]
1. to check the devices connected to machine, just run "adb devices".
2. if #1 does not work, try out "adb kill-server" then "adb start-server"