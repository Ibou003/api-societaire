package api.iard.societaire;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import api.iard.societaire.controler.SocietaireControler;
import api.iard.societaire.model.Societaire;
import api.iard.societaire.repository.SocietaireRepository;
import api.iard.societaire.service.SocietaireService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SocietaireApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SocietaireControlerTest {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private TestRestTemplate restTemplate;

	@MockBean
	private SocietaireRepository societaireRepository;

	@MockBean
	private SocietaireService societaireService;

	@InjectMocks
	private SocietaireControler societaireControler;

	@Before
	public void setUp() throws Exception {
	}
	String exampleCourseJson = "{\"name\":\"Spring\",\"description\":\"10 Steps\",\"steps\":[\"Learn Maven\",\"Import Project\",\"First Example\",\"Second Example\"]}";

	@Test
	public void createSocietaire() throws Exception {
		
		
			Societaire mocksocietaire = buildSocietaire(7996664, "1-AX2-23497", "5996664K");
			
			// SocietaireService.addSocietaire to respond back with mockSocietaire
			
			Mockito.when(
					societaireService.addSocietaire(Mockito.any(Societaire.class))).thenReturn(mocksocietaire);
			
			RequestBuilder requestBuilder = MockMvcRequestBuilders
					.post("/iard/societaires/v1/me")
					.accept(MediaType.APPLICATION_JSON).content(exampleCourseJson)
					.contentType(MediaType.APPLICATION_JSON);
			MvcResult result = mockMvc.perform(requestBuilder).andReturn();
			MockHttpServletResponse response = result.getResponse();
//			assertEquals(HttpStatus.CREATED.value(), response.getStatus());
//			assertEquals("http://localhost/students/Student1/courses/1",
//					response.getHeader(HttpHeaders.LOCATION));
		// HttpHeaders headers = new HttpHeaders();
		// headers.setContentType(MediaType.APPLICATION_JSON);

//		HttpEntity<Societaire> request = new HttpEntity<>(buildSocietaire(
//				7996664, "1-AX2-23497", "5996664K"));
//		System.out.println("Ma request : " + request.toString());
//		ResponseEntity<Societaire> responseExchange = restTemplate
//				.postForEntity("/iard/societaires/v1/societaire/7996664",
//						request, Societaire.class);
//
//		System.out.println("reponse : " + responseExchange.getBody());
		
		
	}

	@Test
	public void testgetSocietaire() throws Exception {

		Societaire body = this.restTemplate.getForObject(
				"/iard/societaires/v1/societaire/7996664", Societaire.class);
		// assertThat(body).isEqualTo(buildSocietaire(7996664, "1-AX2-23497",
		// "5996664K"));

	}

	private Societaire buildSocietaire(long numeroSocietaire,
			String identifiant, String numeroSocietaireFormate) {

		Societaire societaire = new Societaire();
		societaire.setNumeroSocietaire(numeroSocietaire);
		societaire.setIdentifiant(identifiant);
		societaire.setNumeroSocietaireFormate(numeroSocietaireFormate);
		return societaire;
	}
}
