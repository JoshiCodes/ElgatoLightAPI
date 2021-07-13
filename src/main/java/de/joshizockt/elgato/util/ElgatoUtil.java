package de.joshizockt.elgato.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.joshizockt.elgato.Elgato;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ElgatoUtil {

    private final Elgato elgato;

    public ElgatoUtil(Elgato elgato) {
        this.elgato = elgato;
    }

    public JsonElement get() throws IOException {

        URL url = elgato.getURL();
        URLConnection request = url.openConnection();
        request.connect();

        JsonParser parser = new JsonParser();

        InputStream content = (InputStream) request.getContent();

        if(content == null) {
            return new JsonObject();
        }

        return parser.parse(new InputStreamReader(content));

    }

    public void putRequest(JsonElement content) throws IOException {

        URL url = elgato.getURL();
        HttpURLConnection reqest = (HttpURLConnection) url.openConnection();
        reqest.setDoOutput(true);
        reqest.setRequestMethod("PUT");
        OutputStreamWriter writer = new OutputStreamWriter(
                reqest.getOutputStream()
        );
        writer.write(content.toString());
        writer.flush();
        writer.close();

    }

}
