package mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.web.board.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	List<BoardDTO> findAll(); 
}
