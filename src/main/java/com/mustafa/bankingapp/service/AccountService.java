package com.mustafa.bankingapp.service;

import com.mustafa.bankingapp.Dto.AccountDto;
import com.mustafa.bankingapp.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccountAll(Account account);
    List<AccountDto> getAllAccounts();
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id,double amount);
    AccountDto withDraw(Long id,double amount);
    void deleteAccount(Long id);

}
