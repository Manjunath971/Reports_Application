package in.ashokit.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.repo.CitizenPlanRepository;
@Component
public class DataLoader implements CommandLineRunner {
	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(String... args) throws Exception {

		
}
	}