package Dao;

import Base.BaseDao;
import Dto.ProductCommentDetailsDto;
import Dto.ProductDetailsDto;
import Entity.Member;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {

    public List<ProductCommentDetailsDto> findAllCommentsByProduct(Long id){

        String sql = " select" +
                " new Dto.ProductCommentDetailsDto(product.name, product.category.name, product.price," +
                " member.firstName, member.lastName, member.email, member.phoneNumber, productComment.comment," +
                " productComment.commentDate)" +
                " from ProductComment productComment" +
                " left join Product product on product.id = productComment.product.id" +
                " left join Member member on member.id = productComment.member.id" +
                " where productComment.product.id = :id";

        String sql2 = "select member from Member member";

        Query query = getCurrentSession().createQuery(sql2);

        //query.setParameter("id", id);

        return query.list();

    }

    public List<ProductDetailsDto> findCommentNumbersByProducts(){

        ProductDetailsDto dto = new ProductDetailsDto();

        String sql = "select " +
                " new Dto.ProductDetailsDto( product.id, product.name, product.price, " +
                " count(comment)) from productComment " +
                " left join Product product on product.id = productComment.productId";

        String sql2 = "select " +
                " new Dto.ProductDetailsDto( product.id, product.name, product.price, " +
                " case when count(comment) = 0 then null" +
                " else count(comment) end ) " +
                " left join Product product on product.id = productComment.productId" +
                " from productComment ";

        Query query = getCurrentSession().createQuery(sql);

        List<ProductDetailsDto> prd = query.list();

        for(int i = 0; i < prd.size(); i++)
        {
            if(prd.get(i).getCommentNumber() == 0){
                prd.get(i).setCommentNumber(null);
            }
        }

        return prd;

    }

}
