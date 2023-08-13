package sample.app;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String index() {
        String rval = null;
        try {
            InetAddress ia = InetAddress.getLocalHost();
            rval = ia.getHostName();
        } catch (UnknownHostException e) {
            rval = "We can't get hostname.";
        }

        return rval;
    }
}
