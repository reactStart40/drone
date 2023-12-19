package telran.drone.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import telran.drone.dto.MedicalDto;


@Entity
@Table(name = "medications")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@Getter
public class Medication {
	@Column(nullable = false, name = "name_medications")
	String name ;
	
	
	@Column(nullable = false, name= "weight")
	int weight;
	

	@Column(nullable = false, name= "code")
	String code;

public Medication(MedicalDto medicationDto) {
	name= medicationDto.name();
    weight =medicationDto.weight();
    code =medicationDto.code();

}
}