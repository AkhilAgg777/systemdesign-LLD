package dtos;

@Getter
@Setter
public class UpdateProfileRequestDto {
	private Long userId;
	private String newPassword;
}
