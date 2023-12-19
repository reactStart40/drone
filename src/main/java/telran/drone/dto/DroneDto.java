package telran.drone.dto;

public record DroneDto(int id, ModelDroneDto model, int weight, 
			int buttaryProcent, StateDrone state) {

}
