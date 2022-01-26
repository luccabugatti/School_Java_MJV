package mjv.easyjob.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mjv.easyjob.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer>{

}
