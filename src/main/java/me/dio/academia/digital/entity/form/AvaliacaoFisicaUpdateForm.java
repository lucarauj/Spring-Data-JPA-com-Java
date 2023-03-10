package me.dio.academia.digital.entity.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

	@Positive(message = "'${validatedValue}' precisa ser positivo.")
	private double peso;

	@Positive(message = "'${validatedValue}' precisa ser positivo.")
	@DecimalMin(value = "150", message="'${validatedValue}' precisa ser no mínimo {value}." )
	private double altura;
}
