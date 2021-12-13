package Dto;

import java.math.BigDecimal;

public class ProductDetailsDto {

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Long commentNumber;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Long getCommentNumber() {
        //if(commentNumber==0){commentNumber=null;}
        return commentNumber;
    }

    public void setCommentNumber(Long commentNumber) {
        this.commentNumber = commentNumber;
    }
}
