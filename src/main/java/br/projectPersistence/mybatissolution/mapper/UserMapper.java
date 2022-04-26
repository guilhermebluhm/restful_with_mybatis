package br.projectPersistence.mybatissolution.mapper;

import br.projectPersistence.mybatissolution.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> findAll();

    @Insert("INSERT INTO users(id, nome) values (#{id},#{nome});")
    void insertNewUser(User user);


    @Update("UPDATE USERS SET nome = #{nome} where id = #{id};")
    void updateExistentUser(User user);
}
