package pl.sansoft.flexieapp;

import java.io.IOException;
import java.io.Writer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class FlexController {

	@GetMapping(value = "/v2/reports/efficiency")
	public Flux<String> report1(Writer responseWriter) throws IOException {
		Flux<String> flux = Flux.just("red", "white", "blue");
		return flux;
	}
}
