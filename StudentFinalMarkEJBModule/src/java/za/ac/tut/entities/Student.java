/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Obakeng
 */
@Entity
public class Student implements Serializable {

    
    @Id
    
    private Long id;
    private Double semesterMark;
    private Double examMark;
    private Double totalMark;
    private String status;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creationDate;

    public Student() {
    }

    public Student(Long id, Double semesterMark, Double examMark, Double totalMark, String status, Date creationDate) {
        this.id = id;
        this.semesterMark = semesterMark;
        this.examMark = examMark;
        this.totalMark = totalMark;
        this.status = status;
        this.creationDate = creationDate;
    }

    
    
    

    

    public Double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(Double totalMark) {
        this.totalMark = totalMark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public Double getSemesterMark() {
        return semesterMark;
    }

    public void setSemesterMark(Double semesterMark) {
        this.semesterMark = semesterMark;
    }

    public Double getExamMark() {
        return examMark;
    }

    public void setExamMark(Double examMark) {
        this.examMark = examMark;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Student[ id=" + id + " ]";
    }
    
}
