package Application;

import Dao.ProductCommentDao;
import Dto.ProductCommentDetailsDto;
import Entity.Member;
import Entity.ProductComment;
import EntityService.ProductCommentEntityService;

import java.util.List;


public class FindAllCommentsByProductApp {

    public static void main(String[] args){

        ProductCommentEntityService service = new ProductCommentEntityService();

        List<ProductCommentDetailsDto> commentListByProduct = service.findAllCommentsByProduct(2L);

        //int size = commentListByProduct.size();

        for (ProductCommentDetailsDto productCommentDetailsDto : commentListByProduct) {

            System.out.println(productCommentDetailsDto);

        }

    }

}
