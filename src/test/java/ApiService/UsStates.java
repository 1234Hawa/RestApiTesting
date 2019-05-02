package ApiService;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;


import java.util.Scanner;

public class UsStates {


    String URL_STATES ="http://services.groupkt.com/state/get/USA/";
    static RestTemplate restTemplate= new RestTemplate();

    @Test
    public void testApiEndPoint(){
        Scanner scanner = new Scanner(System.in);
        String stateName =scanner.nextLine();
        String URL =URL_STATES+stateName;
        System.out.println(URL);
        String result = restTemplate.getForObject(URL, String.class);
        System.out.println(result);
    }
}
