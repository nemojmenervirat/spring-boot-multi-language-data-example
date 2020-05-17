package com.nemojmenervirat.sbmlde;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class SpringBootMultiLanguageDataExampleApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
		assertNotNull(mvc);
	}

	@Test
	void schoolSubjectControllerTest() throws Exception {
		// expect response for locale sr
		mvc.perform(MockMvcRequestBuilders.get("/school-subject/1").header("accept-language", "sr")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolSubjectId").value(1))
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Математика"));

		// expect response for locale sr
		mvc.perform(MockMvcRequestBuilders.get("/school-subject/1").header("accept-language", "sr-RS")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolSubjectId").value(1))
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Математика"));

		// expect response for locale sr
		mvc.perform(MockMvcRequestBuilders.get("/school-subject/1").header("accept-language", "sr-BA")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolSubjectId").value(1))
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Математика"));

		// expect response for locale es
		mvc.perform(MockMvcRequestBuilders.get("/school-subject/1").header("accept-language", "es-AR")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolSubjectId").value(1))
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Matemáticas"));

		// expect response for default locale
		mvc.perform(MockMvcRequestBuilders.get("/school-subject/1").header("accept-language", "fr")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.schoolSubjectId").value(1))
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Mathematics"));
	}
}
