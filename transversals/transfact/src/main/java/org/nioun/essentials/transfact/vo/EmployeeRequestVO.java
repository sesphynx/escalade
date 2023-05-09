package org.nioun.essentials.transfact.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestVO {

	private String empName;
	private String email;
	private String departementName ;
}
