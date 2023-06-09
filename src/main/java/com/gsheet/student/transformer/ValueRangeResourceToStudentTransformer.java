package com.gsheet.student.transformer;

import com.gsheet.student.dto.StudentDto;
import com.gsheet.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValueRangeResourceToStudentTransformer {
    public Student transform(int id, List<String> values) {
        String firstName = null;
        String middleName = null;
        String lastName = null;
        if (1 <= values.toArray().length) {
            firstName = values.get(0);
        }

        if (2 <= values.toArray().length) {
            middleName = values.get(1);
        }

        if (3 <= values.toArray().length) {
            lastName = values.get(2);
        }

        return Student.builder()
            .id(id)
            .firstName(firstName)
            .middleName(middleName)
            .lastName(lastName)
            .build();
    }
}
