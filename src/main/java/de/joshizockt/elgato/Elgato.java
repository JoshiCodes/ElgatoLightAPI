package de.joshizockt.elgato;

import java.net.MalformedURLException;
import java.net.URL;

public class Elgato {

    private final String host;

    public Elgato(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public URL getURL() throws MalformedURLException {
        return new URL(getHost() + ":9123");
    }

}
