package ethan.web.intro.board.controller;

import ethan.web.intro.board.mapper.BoardMapper;
import ethan.web.intro.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardMapper boardMapper;

    @RequestMapping("/board/list")
    public @ResponseBody List<BoardVO> getBoardList() {
        try {
            List<BoardVO> boardList = boardMapper.selectBoardList();
            return boardList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
