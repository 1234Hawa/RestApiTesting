package ApiService;

import com.google.gson.JsonObject;
import groovy.json.JsonOutput;
import groovy.json.JsonParser;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

public class UsSTATESAPIDemo {

    String URL_USSTATES = "http://services.groupkt.com/state/get/USA/";
    static RestTemplate restTemplate= new RestTemplate();


    @Test
    public void testApiEndPoint(){

        Scanner scanner =new Scanner(System.in);
        String stateName=scanner.nextLine();
        String URL =URL_USSTATES + stateName;
        System.out.println(URL);
        String result = restTemplate.getForObject(URL,String.class);
        System.out.println(result);

       // JsonParser parser= new JsonParser();
        //JsonObject jsonObject=(JsonObject) parser.parse(result).getAsjsonObject
       // String restResponse =jsonObject.getAsJsonObject("RestResponse").get
         //       ("messages").getAsString();
       // System.out.println("My code:"+restResponse);

            }


}
