package lnt.be.common.api.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SortOptions {

    /** 정렬 정보 */
    private List<SortOption> sortOptionList = new ArrayList<>();

    public static SortOptions of(List<SortOption> sortOptionList) {
        SortOptions sortOptions = new SortOptions();
        sortOptions.sortOptionList = sortOptionList;
        return sortOptions;
    }

    public List<SortOption> getAll() { return this.sortOptionList; }

    public int size() { return this.sortOptionList.size(); }

    public void addSortOption(String columnName, Sort.Direction sortDirection) {
        this.sortOptionList.add(new SortOption(columnName, sortDirection));
    }

    public void addSortOption(SortOption sortOption) { this.sortOptionList.add(sortOption); }
}