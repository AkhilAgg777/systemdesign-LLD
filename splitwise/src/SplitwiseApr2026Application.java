import com.akhil.splitwise.commands.RegisterUserCommand;
import com.akhil.splitwise.commands.UpdateProfileCommand;
import com.akhil.splitwise.commands.registry.*;

@SpringBootApplication
@EnableJpaAuditing
public class SplitwiseApr2026Application implements CommandLineRunner {
	@Autowired
	private CommandRegistry commandRegistry;

	@Autowired
	private RegisterUserCommand registerUserCommand;

	@Autowired
	private UpdateProfileCommand updateProfileCommand;

	public static void main(String[] args) {
		SpringApplication.run(SplitwiseApr2026Application.class, args);

	}

	@Override
	public void run(String[] args) throws Exception {

		commandRegistry.registerCommand(registerUserCommand);
		commandRegistry.registerCommand(updateProfileCommand);
//		String input = "Register vinsmokesanji 003 namisswwaann";
		String input = "3 UpdateProfile robinchwan";
		commandRegistry.executeCommandLine(input);
//		while (true) {
//			String input = "INPUT FROM COMMAND LINE";
//			commandRegistry.executeCommandLine(input);
//		}
	}
}
