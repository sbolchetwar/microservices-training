package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public Person getPerson(Long id) {
		// TODO Auto-generated method stub
		return personRepository.getOne(id);
	}

	@Override
	public Person editPerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	public void deletePerson(Person person) {
		// TODO Auto-generated method stub
		personRepository.delete(person);
	}

	@Override
	public void deletePerson(Long id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
	}

	@Override
	public List<Person> getAllPersons(int pageNumber, int pageSiz) {
		// TODO Auto-generated method stub
		return personRepository.findAll(new PageRequest(pageNumber,pageSiz)).getContent();
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

}
