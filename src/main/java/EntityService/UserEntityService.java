package EntityService;

import Dao.UserDao;
import Dto.UserDetailsDto;

import java.util.List;

public class UserEntityService {

    private UserDao userDao;

    public List<UserDetailsDto> findCommentsByUser(Long id){

        return userDao.findCommentsByUser(id);

    }

}
