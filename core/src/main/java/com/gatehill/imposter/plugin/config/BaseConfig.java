package com.gatehill.imposter.plugin.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseConfig {
    private String plugin;
    private String basePath;
    private String responseFile;

    public String getResponseFile() {
        return responseFile;
    }

    public String getPlugin() {
        return plugin;
    }

    public String getBasePath() {
        return basePath;
    }
}