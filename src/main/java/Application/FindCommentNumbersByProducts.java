package Application;

import Dto.ProductCommentDetailsDto;
import Dto.ProductDetailsDto;
import EntityService.ProductCommentEntityService;

import java.util.List;

public class FindCommentNumbersByProducts {

    public static void main(String[] args){

        ProductCommentEntityService service = new ProductCommentEntityService();

        List<ProductDetailsDto> commentNumbersByProducts = service.findCommentNumbersByProducts();

        //int size = commentListByProduct.size();

        for (ProductDetailsDto productDetailsDto : commentNumbersByProducts) {

            System.out.println(productDetailsDto);

        }

    }

}
