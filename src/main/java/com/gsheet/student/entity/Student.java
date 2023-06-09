package com.gsheet.student.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
}
