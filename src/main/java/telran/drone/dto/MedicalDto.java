package telran.drone.dto;
import jakarta.validation.constraints.*;

public record MedicalDto( String name,
				@NotNull @Max(500) int weight, @NotNull
				@Pattern(regexp = "[A-Z0-9_]+", message = "incorrect code")
				String code){

		}

