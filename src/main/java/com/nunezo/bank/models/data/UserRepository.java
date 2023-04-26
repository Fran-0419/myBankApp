package com.nunezo.bank.models.data;

import com.nunezo.bank.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
