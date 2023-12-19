package telran.drone.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import telran.drone.dto.*;


@Entity
@Table(name="drones")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@Getter

public class Drone {

	@Column(nullable = false, name = "serial_number")
	String serialNumber;

	@Enumerated(value=EnumType.STRING)
	@Column(nullable = false)
	ModelDroneDto model;

	@Column(nullable = false, name = "weight")
	int weight;

	@Column(nullable = false, name = "battery_condition")
	int batteryPercent;

	@Enumerated(value=EnumType.STRING)
	@Column(nullable = false)
	StateDrone state;

	public Drone(DroneDto droneDto) {
		serialNumber = droneDto.serialNumber();
	    model = droneDto.model();
	    weight = droneDto.weigh();
	    batteryPercent = droneDto.batteryPercent();
	    state = droneDto.state();

	}

	public DroneDto build() {

		return new DroneDto(serialNumber, model, weight, batteryPercent, state);
	}


	public void setBatteryPercent(int batteryPercent) {
		this.batteryPercent = batteryPercent;
	}

	public void setState(StateDrone state) {
		this.state = state;
	}

}

