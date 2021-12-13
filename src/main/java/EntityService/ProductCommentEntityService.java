package EntityService;

import Dao.ProductCommentDao;
import Dto.ProductCommentDetailsDto;
import Dto.ProductDetailsDto;
import Entity.Member;

import java.util.List;

public class ProductCommentEntityService {

    private ProductCommentDao productCommentDao = new ProductCommentDao();

    public void setProductCommentDao(ProductCommentDao productCommentDao) {
        this.productCommentDao = productCommentDao;
    }

    public List<ProductCommentDetailsDto> findAllCommentsByProduct(Long id){

        return productCommentDao.findAllCommentsByProduct(id);

    }

    public List<ProductDetailsDto> findCommentNumbersByProducts(){

        return productCommentDao.findCommentNumbersByProducts();

    }

}
