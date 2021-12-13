package Dao;

import Base.BaseDao;
import Dto.UserDetailsDto;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao {

    public List<UserDetailsDto> findCommentsByUser(Long id){

        String sql = " select " +
                     " new Dto.UserDetailsDto( user.id, user.name, product.name, " +
                     " productComment.comment, productComment.commentDate )" +
                     " from productComment " +
                     " left join User user on user.id = productComment.userId" +
                     " left join Product product on product.id = productComment.productId " +
                     " where productComment.userId = :givenId " +
                     " and (count(userId) from productComment where user.id = productComment.userId) > 0";

        Query query = getCurrentSession().createQuery(sql);

        query.setParameter("givenId", id);

        return query.list();

    }

}
