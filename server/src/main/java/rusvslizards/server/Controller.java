package rusvslizards.server;
import io.grpc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {

    ServiceRuss serviceRuss;

    ServiceLizards serviceLizards;

<<<<<<< HEAD
=======
    @RequestMapping(value="/tester")
    public String test() {
        System.out.println("Hi!");
        return "index";
    }

    @RequestMapping(value="/")
    public String index() { return "index"; };
    
>>>>>>> 2e54d0e3a7d7c514c08d6fd49d27ea0f0c772905
    @RequestMapping(value = "/RequestToRuss", method = RequestMethod.GET)
    public ResponseEntity<String> RequestToRuss() throws IOException, InterruptedException {
        System.out.println("here");
        Server server = ServerBuilder.forPort(9094).
                addService(serviceRuss)
                .build();
        server.start();
        russvslizards.server.Response response = serviceRuss.responseToClient(russvslizards.server.Request.newBuilder().build());
        String phrase = response.getPhrase();
        server.awaitTermination();
        return new ResponseEntity<>(phrase, HttpStatus.OK);
    }

    @RequestMapping(value = "/RequestToLizards", method = RequestMethod.GET)
    public ResponseEntity<String> RequestToLizards() throws IOException, InterruptedException {
        System.out.println("jeblan");
        Server server = ServerBuilder.forPort(9095).
                addService(serviceLizards)
                .build();
        server.start();
        russvslizards.server.Response response = serviceLizards.responseToClient(russvslizards.server.Request.newBuilder().build());
        String phrase = response.getPhrase();
        server.awaitTermination();
        return new ResponseEntity<>(phrase, HttpStatus.OK);
    }
}
