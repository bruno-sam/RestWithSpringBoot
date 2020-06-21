package br.com.bruno;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BemVindoController {
	
	private static final String template = "Seja bem vindo %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/bemvindo")
    public BemVindo bemVindo(@RequestParam(value="name", defaultValue="Mundo") String name) { 
    	return new BemVindo(counter.incrementAndGet(), String.format(template, name));
    }
	

}
