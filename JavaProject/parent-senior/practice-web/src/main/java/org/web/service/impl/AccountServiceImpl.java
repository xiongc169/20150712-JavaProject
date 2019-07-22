package org.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.web.dao.AccountDao;
import org.web.domain.Account;
import org.web.service.AccountService;

/**
 * @Desc AccountServiceImpl
 * @Author
 * @Date
 * @Version 1.0
 */
@Component("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account saveAccount(Account account) {
        account = accountDao.saveAccount(account);
        return account;
    }
}