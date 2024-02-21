package com.tobeto.javaBootcamp.business.requests.create.instructor;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateInstructorRequest {
    private String companyName;
}
