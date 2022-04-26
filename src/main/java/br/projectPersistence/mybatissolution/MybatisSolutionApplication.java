package br.projectPersistence.mybatissolution;

import br.projectPersistence.mybatissolution.model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("br.projectPersistence.mybatissolution.mapper")
@SpringBootApplication
public class MybatisSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSolutionApplication.class, args);
	}

}
