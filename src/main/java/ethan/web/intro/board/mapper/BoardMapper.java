package ethan.web.intro.board.mapper;

import ethan.web.intro.board.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BoardMapper {

    public List<BoardVO> selectBoardList() throws Exception;
}
