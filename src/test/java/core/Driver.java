package core;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static AppiumDriver appiumDriver;

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void inicializaDriver() throws MalformedURLException {
        String url = "http://127.0.0.1:4723";
        BaseOptions options = new BaseOptions<>();
        options.setPlatformName("Android");
        options.setAutomationName("uiautomator2");
        options.setCapability("deviceName", "ChronosMobile");
        options.setCapability("appPackage", "br.com.chronosacademy");
        options.setCapability("appActivity", "br.com.chronosacademy.MainActivity");
        options.setCapability("appium:uiautomator2ServerInstallTimeout", "120000");

        appiumDriver = new AppiumDriver(new URL(url), options);
    }

    public static void inicializaDriverPerfecto() throws MalformedURLException {
        String cloudName = "trial";
        String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE3MzczODA5NTQsImp0aSI6IjFlNjg3ZDMzLTY4YzYtNDI0My1iOTk2LWI3ZDM3ZWMyMjE5MiIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6IjBhZmEwYjM2LTBmZGYtNDdjMS04MDczLThhOWUzYWJjYWYzMyIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiZGI4MGU5MjUtZmNmNC00ZmEwLTk5MWYtOTk5NmM5NGJhMGZiIiwic2Vzc2lvbl9zdGF0ZSI6ImI1YzY5MmNkLTBjZDQtNDJiMy04YjBhLWY4MjdiYTI4ZjhkNCIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwiLCJzaWQiOiJiNWM2OTJjZC0wY2Q0LTQyYjMtOGIwYS1mODI3YmEyOGY4ZDQifQ.XXgHnLPqz9IUS0kbZQZZfn1oVHZv0dSbRkNAjPnbd-8";
        String url = "https://" + cloudName + ".perfectomobile.com/nexperience/perfectomobile/wd/hub";
        BaseOptions options = new BaseOptions<>();
        options.setPlatformName("Android");
        options.setAutomationName("uiautomator2");
        options.setCapability("app", "PRIVATE:ChronosAcademy.apk");
        options.setCapability("model", "Pixel 7");
        options.setCapability("perfecto:securityToken", securityToken);

        appiumDriver = new AppiumDriver(new URL(url), options);
    }

    public static void swipe(int left, int top, String direction, double percent) {
        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

        ((JavascriptExecutor) Driver.getAppiumDriver()).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", left, "top", top, "width", dimension.getWidth() / 2,
                "height", dimension.getHeight() / 2, "direction", direction, "percent", percent
        ));
    }


}
