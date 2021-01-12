package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import food.exception.NotExistException;
import model.dao.RestaurantDAO;
import model.dao.SpecificDAO;
import model.entity.RestaurantEntity;
import model.entity.SpecificEntity;

public class RestaurantInsert implements Action {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		String rid = request.getParameter("rid");
		String rname = request.getParameter("rname");
		SpecificEntity sid = null;
		String pagelink = request.getParameter("pagelink");

		if (rid != null && rid.length() != 0 && rname != null && rname.length() != 0
				&& pagelink != null && pagelink.length() != 0) {

			try {
				sid = SpecificDAO.getSpecificEntity(request.getParameter("specifics"));
				RestaurantEntity restaurant = new RestaurantEntity(rid, rname, sid, pagelink);

				boolean result = RestaurantDAO.addRestaurant(restaurant);

				if (result) {
					request.getSession().setAttribute("restaurant", restaurant);
					request.getSession().setAttribute("successMsg", "레스토랑 추가완료");

					url = "restaurantDetail.jsp";
				} else {
					request.getSession().setAttribute("errorMsg", "레스토랑 생성시 오류");
				}

			} catch (NotExistException s) {
				request.getSession().setAttribute("errorMsg", s.getMessage());
				
			}catch(Exception s) {
				request.getSession().setAttribute("errorMsg", "사용할 수 없는 ID입니다.");	
				
			}
		} else {
			request.getSession().setAttribute("errorMsg", "모든 요소 값들을 입력해주세요!");

		}
		request.getRequestDispatcher(url).forward(request, response);
	}
}
