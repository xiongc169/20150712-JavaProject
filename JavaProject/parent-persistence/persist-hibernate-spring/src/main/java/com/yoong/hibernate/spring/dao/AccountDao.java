package com.yoong.hibernate.spring.dao;

import com.yoong.hibernate.spring.domain.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class AccountDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save() {
        Account account = new Account();
        account.setAccountId(UUID.randomUUID().toString());
        account.setCreateTime(new Date());
        account.setModifyTime(new Date());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
    }
}
