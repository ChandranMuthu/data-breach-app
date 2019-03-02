package org.camunda.bpm.hcl.rbs;

import org.camunda.bpm.hcl.rbs.domain.Role;
import org.camunda.bpm.hcl.rbs.domain.User;
import org.camunda.bpm.hcl.rbs.repository.RoleRepository;
import org.camunda.bpm.hcl.rbs.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

	public static final Logger log = LoggerFactory.getLogger(DataInitializer.class);
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		Role highRiskRole = new Role();
		highRiskRole.setRoleId(1);
		highRiskRole.setRoleName("High_Risk_Team");
		roleRepository.save(highRiskRole);
		User user = new User();
		user.setUsername("user1");
		user.setPassword(this.passwordEncoder.encode("user1"));
		user.setRole(highRiskRole);
		userRepository.save(user);

		this.userRepository.findAll().forEach(v -> log.info(" User :" + v.toString()));
	}
}
