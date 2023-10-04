package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
@Repository
public class CarDaoImp implements CarDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> listCars(Integer count) {
        return sessionFactory.getCurrentSession().createQuery("from Car")
                    .setMaxResults(count != null ? count : Integer.MAX_VALUE).getResultList();
    }
}
