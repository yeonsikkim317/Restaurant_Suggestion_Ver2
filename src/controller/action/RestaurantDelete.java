package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.RestaurantDAO;

public class RestaurantDelete implements Action{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		String rid = request.getParameter("rid");

		try {
			boolean result = RestaurantDAO.deleteRestaurant(rid);
			if(result) {
				request.getSession().setAttribute("restaurantAll",RestaurantDAO.getAllRestaurant());
				request.getSession().setAttribute("seccessMsg","레스토랑 삭제완료");
				url = "restaurantList.jsp";
			}else {
				request.getSession().setAttribute("errorMsg", "레스토랑 삭제실패");
			}
		}catch(Exception s){			
			request.getSession().setAttribute("errorMsg", s.getMessage());
			s.printStackTrace();
		}
		request.getRequestDispatcher(url).forward(request, response);
	}	
}
