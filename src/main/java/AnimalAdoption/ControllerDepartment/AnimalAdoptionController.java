package AnimalAdoption.ControllerDepartment;

import java.util.Date;
import java.util.List;

import AnimalAdoption.AuxiliaryDepartment.AuxiliaryFunctions;
import AnimalAdoption.ObjectDepartment.Animal;
import AnimalAdoption.ObjectDepartment.Token;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AnimalAdoptionController {

    AuxiliaryFunctions auxiliaryFunctions = new AuxiliaryFunctions();
    final String GET_TOKEN_URL = "https://api.petfinder.com/v2/oauth2/token";
    final String GET_DOGS_URL = "https://api.petfinder.com/v2/animals?type=dog";
    final String CLIENT_ID = "qXlaQAxzdsjksai5JPun6F0dNlzQgjoJqWHric7oTOzQ352PGy";
    final String CLIENT_SECRET = "eTBcEL5l4h8q0X515P7YkIl3XWyKaRYpGzUpy793";
    boolean isFirstTimeCall = true;
    Date createdDate = new java.util.Date();
    Token token = new Token();
    RestTemplate restTemplate = new RestTemplate();
    ObjectMapper objectMapper = new ObjectMapper();
    ResponseEntity<String> jsonResponse;
    HttpHeaders headers = new HttpHeaders();
    HttpEntity<String> entity;

    @GetMapping("/getDogs")
    public List<Animal> getDogs() throws JsonProcessingException {

        if (isFirstTimeCall || auxiliaryFunctions.isTheTimePassed(createdDate, token)) {
            headers.add("content-type", "application/x-www-form-urlencoded");
            entity = new HttpEntity<>("grant_type=client_credentials&client_id=" + CLIENT_ID + "&client_secret=" + CLIENT_SECRET, headers);
            jsonResponse = restTemplate.exchange(GET_TOKEN_URL, HttpMethod.POST, entity, String.class);
            token = objectMapper.readValue(jsonResponse.getBody(), Token.class);
            createdDate = new java.util.Date();
            isFirstTimeCall = false;
        }

        headers.add("Authorization", "Bearer " + token.access_token);
        entity = new HttpEntity<>("body", headers);
        jsonResponse = restTemplate.exchange(GET_DOGS_URL, HttpMethod.GET, entity, String.class);

        return objectMapper.readValue(jsonResponse.getBody(), new TypeReference<List<Animal>>(){});

    }
}
