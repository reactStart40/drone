package telran.drone.dto;
import jakarta.validation.constraints.*;

public record DroneDto(@NotNull @Pattern(regexp ="[a-zA-Z0-9]] {1,100}",
		message = "incorrect serial number") String serialNumber,
		
		ModelDroneDto model,
		
		@NotNull(message = "Weight is required")
		@Positive(message = "Weight must be a positive number")
		@Max(value = 500, message = "Weight cannot exceed 500") int weigh,
		
		@Min (0) @Positive(message = " Battery cannot be negative") 
		@Max(value = 100, message ="Incorrect value battary cannot exceed 100") int batteryPercent,
	
		StateDrone  state) {

}