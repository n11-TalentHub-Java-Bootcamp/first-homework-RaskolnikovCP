package Application;

import Dto.ProductDetailsDto;
import Dto.UserDetailsDto;
import EntityService.UserEntityService;

import java.util.List;

public class FindCommentsByUser {

    public static void main(String[] args){

        UserEntityService service = new UserEntityService();

        List<UserDetailsDto> commentsByUser = service.findCommentsByUser(2L);

        //int size = commentListByProduct.size();

        for (UserDetailsDto userDetailsDto : commentsByUser) {

            System.out.println(userDetailsDto);

        }

    }

}
