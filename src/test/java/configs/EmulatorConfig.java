package configs;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${mobile}.properties"})

public interface EmulatorConfig extends Config {

    @Key("appiumServer")
    String appiumServer();

    @Key("deviceName")
    String deviceName();

    @Key("platformVersion")
    String platformVersion();

    @Key("appPath")
    String appPath();

    @Key("appPackage")
    String appPackage();

}