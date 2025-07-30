package lnt.be.common.api.service.converter;


import lnt.be.common.api.service.dto.PagingOption;
import lnt.be.common.api.service.dto.SortOptions;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import java.util.stream.Collectors;

public class PageableConverter {

    private PageableConverter() {throw new IllegalStateException("Utility class");}

    public static Pageable convert(PagingOption pagingOption) {
        return PageRequest.of( pagingOption.getPageNumber() - 1, pagingOption.getPageSize());
    }

    public static Pageable convert(PagingOption pagingOption, SortOptions sortOptions) {
        return PageRequest.of( pagingOption.getPageNumber() - 1, pagingOption.getPageSize(), convertSort(sortOptions));
    }

    private static Sort convertSort(SortOptions sortOptions) {
        if (sortOptions == null) {
            return Sort.unsorted();
        }

        return Sort.by(sortOptions.getSortOptionList().stream().map(sortOption -> new Order(sortOption.getSortDirection(),
                        sortOption.getColumnName()))
                .collect(Collectors.toList()));
    }
}
