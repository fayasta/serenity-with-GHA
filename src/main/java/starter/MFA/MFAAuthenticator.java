package starter.MFA;

import org.jboss.aerogear.security.otp.Totp;

public class MFAAuthenticator {

    public static String getMFAToken(){
        String optKeyStr = "";
        Totp totp = new Totp(optKeyStr);
        return totp.now();
    }

}
