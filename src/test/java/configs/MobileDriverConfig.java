package configs;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${mobile}.properties"})
public interface MobileDriverConfig extends Config {

    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("baseUrl")
    String baseUrl();

    @Key("appUrl")
    String appUrl();

    @Key("device")
    String device();

    @Key("os_version")
    String osVersion();

    @Key("project")
    String projectName();

    @Key("build")
    String buildName();

    @Key("name")
    String testName();


}
