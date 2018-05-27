package api.iard.societaire;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static org.assertj.core.api.Assertions.assertThat;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import api.iard.societaire.model.Societaire;
import api.iard.societaire.repository.SocietaireRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SocietaireApplicationTests {
	 @Autowired
	 private TestRestTemplate restTemplate;
	 
	 @Rule
	 public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().dynamicPort());
	 
	 @MockBean(name = "societaireRepository")
	 private SocietaireRepository societaireRepository;
	 
	  @Value("api.societaire.url")
	  private String urlApiSocietaire;
	  
	 @Test
	 public void testgetSocietaire() throws IOException {
		 
		 Societaire societairereq = buildSocietaire(7996664,"1-AX2-23497","5996664K");
		 
		 wireMockRule.stubFor(get("/iard/societaires/v1/societaire/7996664")
			     .willReturn(aResponse()
	                        .withStatus(200)
	                        .withHeader("Content-Type", "application/json")
	                        .withBody("")
	                )
	        );
		 
		 
		 when(societaireRepository.findByNumeroSocietaire(7996664)).thenReturn(societairereq);
		 
		 Societaire response = restTemplate.exchange("/iard/societaires/v1/societaire/7996664", HttpMethod.GET, null, 
				 new ParameterizedTypeReference<Societaire>() {}).getBody();
		 
		 System.out.println("response : "+response);
		 System.out.println("HttpStatus.CREATED.value() : "+ societairereq);
		 assertThat(response).isNotNull();
//		 assertThat(response).extracting("numeroSocietaire","identifiant","numeroSocietaireFormate").contains(7996664,"1-AX2-23497","5996664K");	 
	 }
	 
	@Test
	public void contextLoads() {
	
	}
	
	
	private Societaire buildSocietaire(long numeroSocietaire, String identifiant, String numeroSocietaireFormate){
		
		Societaire societaire = new Societaire();
		societaire.setNumeroSocietaire(numeroSocietaire);
		societaire.setIdentifiant(identifiant);
		societaire.setNumeroSocietaireFormate(numeroSocietaireFormate);
		return societaire;
		
	}

}
