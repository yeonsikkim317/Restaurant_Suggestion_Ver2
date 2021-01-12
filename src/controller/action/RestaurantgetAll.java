package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.RestaurantDAO;

public class RestaurantgetAll implements Action {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		
		try {
			request.getSession().setAttribute("restaurantAll", RestaurantDAO.getAllRestaurant());
			request.getSession().setAttribute("successMsg", "레스토랑 검색 성공");
			url = "restaurantList.jsp";
		} catch (Exception s) {
			request.getSession().setAttribute("errorMsg", s.getMessage());
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
}
