package com.yan.dao;

import com.yan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
//      查看所有的书
      List<Books> showAll();
//      通过id查找书
      Books showBookById(@Param("bookID") int bookID);
//      添加一本书
      int addBook(Books books);
//      修改一本书
      int updateBook(Books books);
//      删除一本书
      int deleteBook(@Param("bookID") int bookID);
//      通过书名查询
      Books showBookByName(@Param("bookName") String bookName);
//      模糊查询
      List<emp> showBookByLike(@Param("bookName") String bookName);
}
