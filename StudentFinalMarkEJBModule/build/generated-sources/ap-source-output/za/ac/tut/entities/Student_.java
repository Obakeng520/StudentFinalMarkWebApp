package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T15:05:02")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Double> examMark;
    public static volatile SingularAttribute<Student, Double> totalMark;
    public static volatile SingularAttribute<Student, Long> id;
    public static volatile SingularAttribute<Student, Date> creationDate;
    public static volatile SingularAttribute<Student, Double> semesterMark;
    public static volatile SingularAttribute<Student, String> status;

}