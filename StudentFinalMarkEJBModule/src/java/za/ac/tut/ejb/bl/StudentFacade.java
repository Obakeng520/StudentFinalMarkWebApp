/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Student;

/**
 *
 * @author Obakeng
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "StudentFinalMarkEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public List<Student> getStudentsByStatus(String status) {
        Query query = em.createQuery("SELECT s FROM Student s WHERE s.status = ?1");
        query.setParameter(1, status);
        List<Student> student = query.getResultList();
        return student;
    }

    @Override
    public Long getTotalStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s");
        Long count = (Long)query.getSingleResult();
        return count;
    }

    @Override
    public Long getPassedStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.totalMark >= 50.00 AND s.totalMark < 75.00");
        Long passed = (Long)query.getSingleResult();
        return passed;
    }

    @Override
    public Long getFailedStudent() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.totalMark < 40.00");
        Long failed = (Long)query.getSingleResult();
        return failed;
    }

    @Override
    public Long getSupplementeryStudents() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.totalMark >= 40.00 AND s.totalMark < 50.00");
        Long passed = (Long)query.getSingleResult();
        return passed;
    }

    @Override
    public Double getAvarage() {
        String queryStr = "SELECT AVG(s.totalMark) FROM Student s";
        Query query = em.createQuery(queryStr);
        Double avg = (Double)query.getSingleResult();
        return avg;
    }

    @Override
    public Double getHighestMark() {
        Query query = em.createQuery("SELECT MAX(s.totalMark) FROM Student s");
        Double max = (Double)query.getSingleResult();
        return max;
    }

    @Override
    public Double getLowest() {
        Query query = em.createQuery("SELECT MIN(s.totalMark) FROM Student s");
        Double min = (Double)query.getSingleResult();
        return min;
    }

    @Override
    public Long getStudentsWithDistinction() {
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s WHERE s.totalMark >= 75.00");
        Long distinction = (Long)query.getSingleResult();
        return distinction;
    }

    
    
}
