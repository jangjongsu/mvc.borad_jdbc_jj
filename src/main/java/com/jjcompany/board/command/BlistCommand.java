package com.jjcompany.board.command;
import java.util.ArrayList;

import org.springframework.ui.Model;

import com.jjcompany.board.dao.BDao;
import com.jjcompany.board.dto.BDto;

public class BlistCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);

	}

}
