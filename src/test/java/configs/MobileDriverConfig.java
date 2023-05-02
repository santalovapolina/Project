package configs;

import org.aeonbits.owner.Config;

@EmulatorConfig.LoadPolicy(EmulatorConfig.LoadType.MERGE)
@Config.Sources({"classpath:${envMobile}.properties"})
public interface MobileDriverConfig extends Config {
    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("baseURL")
    String baseUrl();

    @Key("appURL")
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
