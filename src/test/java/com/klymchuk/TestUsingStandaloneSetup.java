package com.klymchuk;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class TestUsingStandaloneSetup {
	
	private final MockMvc mockMvc = standaloneSetup(new AddressController())
									.build();
	
	@Test
	public void validate_get_address() throws Exception {
		mockMvc.perform(get("/address"))
				.andExpect(status().isOk())
				.andExpect(
						content().contentType(MediaType.APPLICATION_JSON_VALUE))
						.andExpect(jsonPath("$.street").value("FL"));
	}

}
