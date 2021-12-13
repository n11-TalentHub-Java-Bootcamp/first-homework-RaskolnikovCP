package Entity;

import javax.persistence.*;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_COMMENT")
public class ProductComment {

    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @Column(length = 500, name = "COMMENT")
    private String comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", foreignKey = @ForeignKey(name = "FK_MEMBER_COMMENT_ID"))
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID", foreignKey = @ForeignKey(name = "FK_PRODUCT_MEMBER_ID"))
    private Member member;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Member getUser() {
        return member;
    }

    public void setUser(Member member) {
        this.member = member;
    }

    @Override
    public String toString(){
        return "Product Comment{" +
                "id=" + id +
                ", comment='" + comment + "\'" +
                ", comment date=" + commentDate +
                ", product=" + product + "\'" +
                ", user=" + member + "\'" +
                '}';

    }

}
