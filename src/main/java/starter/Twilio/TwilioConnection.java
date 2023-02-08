package starter.Twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class TwilioConnection {
    // Your API key from twilio.com/console/authy/applications
    // DANGER! This is insecure. See http://twil.io/secure
    //public static final String API_KEY = "your_api_key";
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";

    public static final String TWILIO_NUMBER = "+17655236143";


    //new
    private static final String API_KEY = "";
    private static final String API_URL = "https://api.authy.com/protected/json/sms/;


    public static void generateOneTimePassword() {
        String oneTimePassword = "323232";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new PhoneNumber(TWILIO_NUMBER),
                        new PhoneNumber("+"),
                        "One-Time Password: " + oneTimePassword)
                .create();

        System.out.println("****** token *********");
        System.out.println(oneTimePassword);
        System.out.println("****** token *********");
    }


    public static void try2(){
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(API_URL);

        // Add API Key to header
        request.addHeader("X-Authy-API-Key", API_KEY);

        // Set request body
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "Your OTP is:");
        requestBody.put("force", true);
        StringEntity entity = null;
        try {
            entity = new StringEntity(requestBody.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        request.setEntity(entity);

        try {
            HttpResponse response = httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                // OTP generated successfully
                String responseBody = EntityUtils.toString(response.getEntity());
                JSONObject json = new JSONObject(responseBody);
                System.out.println("OTP: " + json.getString("message"));
            } else {
                // Error generating OTP
                System.out.println("Error generating OTP, status code: " + statusCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

