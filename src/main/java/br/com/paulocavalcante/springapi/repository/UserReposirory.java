package br.com.paulocavalcante.springapi.repository;

import br.com.paulocavalcante.springapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReposirory extends CrudRepository<User, Long > {

}
