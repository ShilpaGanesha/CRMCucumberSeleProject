$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Deals.feature");
formatter.feature({
  "name": "To test the Crm application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "To  login  Crm application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To open application and navigate url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.to_open_application_and_navigate_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks  loginlink",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.user_clicks_loginlink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.enter_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click  login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify Deals functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.user_is_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on deals",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.click_on_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on new deals button",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.click_on_new_deals_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the deal credentials and save",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.enter_the_deal_credentials_and_save(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-QESFRFOR\u0027, ip: \u0027192.168.86.29\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\shilp\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57858}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d440cf532c261991778f159a4c28f97e\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.DealPages.DealPage.DealsCredsAndSave(DealPage.java:58)\r\n\tat com.stepDefnitions.DealSteps.enter_the_deal_credentials_and_save(DealSteps.java:68)\r\n\tat ✽.enter the deal credentials and save(file:///C:/Users/shilp/eclipse-workspace/FreeCRM/src/test/resources/Features/Deals.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "take a sceenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefnitions.DealSteps.take_a_sceenshot()"
});
formatter.result({
  "status": "skipped"
});
});