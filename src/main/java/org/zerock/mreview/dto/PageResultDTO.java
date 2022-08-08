package org.zerock.mreview.dto;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
public class PageResultDTO<DTO, EN> {
    private List<DTO> dtoList;
    private int totalPage;
    private int page;
    private int size;
    private int start, end;
    private boolean prev, next;
    private List<Integer> pageList;

    public PageResultDTO(Page<EN> result, Function<EN,DTO> fn ){

        dtoList = result.stream().map(fn).collect(Collectors.toList());
        //연쇄적으로 명령 집어넣기    dto리스트에다가   fn 함수에 따라     가져온데이터를 리스트 형태로

        totalPage = result.getTotalPages();  //전체페이지 받아오기

        makePageList(result.getPageable());
    }


    private void makePageList(Pageable pageable){
        this.page = pageable.getPageNumber()+1;
        this.size = pageable.getPageSize();
        int tempEnd = (int)(Math.ceil(page/10.0)) * 10;

        start = tempEnd - 9;

        prev = start > 1;

        end = totalPage > tempEnd ? tempEnd: totalPage;

        next = totalPage > tempEnd;

        pageList = IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());

    }

}
