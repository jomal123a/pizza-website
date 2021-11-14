package com.teammichu.pizzawebsite.Repository;

import com.teammichu.pizzawebsite.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserRepository extends CrudRepository<User, Long> {
}
