package main.java;

import com.google.api.GoogleAPI;
import com.google.api.translate.Language;
import com.google.api.translate.Translate;

public class Main1 {
    public static void main(String[] args) throws Exception {
        // Set the HTTP referrer to your website address.
        GoogleAPI.setHttpReferrer("sotouch-myway.com");

        // Set the Google Translate API key
        // See: http://code.google.com/apis/language/translate/v2/getting_started.html
        GoogleAPI.setKey("AIzaSyDMXXbsoO72mZe4ygopLKfcHKUZ-6UBOe8");

//        String translatedText = Translate.DEFAULT.execute("Bonjour le monde", Language.FRENCH, Language.ENGLISH);
        String translatedText = Translate.DEFAULT.execute("Hello World", Language.ENGLISH, Language.FRENCH);

        System.out.println(translatedText);
    }
}