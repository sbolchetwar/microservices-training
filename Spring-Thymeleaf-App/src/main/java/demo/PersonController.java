package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("person", new Person());
		return "greeting";
	}

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public String addPagePerson(@ModelAttribute Person person, Model model) {
		personService.createPerson(person);
		model.addAttribute("persons", personService.getAllPersons());
		return "result";
	}
}
