package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.RestaurantDAO;
import model.dao.SpecificDAO;

public class GetRestaurants implements Action{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String url = "showError.jsp";
		
		try {
			String sid = SpecificDAO.getSid(request.getParameter("sname"));
			request.getSession().setAttribute("successMsg", "검색 성공");
			request.getSession().setAttribute("restaurants", RestaurantDAO.getRestaurant(sid));
			url = "resultList.jsp";	//수정삭제기능 없는 음식점들 출력화면
		}catch(Exception s){
			request.getSession().setAttribute("errorMsg", s.getMessage());
			s.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}	
}
