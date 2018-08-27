package com.example.bookappointment.mapper;

import com.example.bookappointment.domain.Book;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface BookMapper {
    /*
     * 根据id查询书
     *
     */
    Book queryById(long id);
    List<Book> querySome(String name);
    List<Book> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /*减少管存数量
     * 用返回值可判断当前库存是否还有书
     */
    int reduceNumber(long bookId);


}
