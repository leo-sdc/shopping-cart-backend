/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lsc.shopping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProductsControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
	public void productsShouldReturnWholeList() throws Exception {

		this.mockMvc.perform(get("/products")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().json(
						"[{\"id\":1,\"name\":\"Java\",\"value\":50.0},{\"id\":2,\"name\":\"Javascript\",\"value\":40.0},{\"id\":3,\"name\":\"Python\",\"value\":30.0},{\"id\":4,\"name\":\"PHP\",\"value\":20.0},{\"id\":5,\"name\":\"C#\",\"value\":10.0},{\"id\":6,\"name\":\"Ruby\",\"value\":45.0},{\"id\":7,\"name\":\"Scala\",\"value\":35.0},{\"id\":8,\"name\":\"Swift\",\"value\":25.0},{\"id\":9,\"name\":\"Kotlin\",\"value\":15.0},{\"id\":10,\"name\":\"Go\",\"value\":5.0}]"));
    }

}
