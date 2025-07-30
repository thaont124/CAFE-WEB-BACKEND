package lnt.be.common.api.service.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SortOption {

    /** 정렬할 field name */
    private String columnName;

    /** 정렬 순서 */
    private Sort.Direction sortDirection;

    public SortOption(String columnName, Sort.Direction sortDirection) {
        this.columnName = columnName;
        this.sortDirection = sortDirection;
    }
}