package com.jjcompany.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jjcompany.board.dao.BDao;
import com.jjcompany.board.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		// model안에 있는 request 객체를 빼기위해 Map 형식으로 메핑 후 Map의 키값인 request 로 request객체를 뺌

		String bid = request.getParameter("bid");
		BDao dao = new BDao();
		BDto dto = dao.content_view(bid);
		// dao.upHit(bid);
		
		model.addAttribute("content", dto);
		
		
	}

}
