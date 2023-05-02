package configs;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://kion.ru")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("version")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();
}
