package lnt.be.common.api.service.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PagingOption {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    public static final PagingOption DEFAULT = new PagingOption();

    /** number of items to show per page, example = "20" */
    private int pageSize;

    /** current page, example = "1" */
    private int pageNumber;

    public PagingOption() {
        this.pageSize = 20;
        this.pageNumber = 1;
    }

    public PagingOption(int pageSize, int pageNumber) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
    }
}
