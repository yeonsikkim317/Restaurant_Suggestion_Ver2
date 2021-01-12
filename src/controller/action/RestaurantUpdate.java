package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.RestaurantDAO;

public class RestaurantUpdate implements Action {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "showError.jsp";
		String pagelink = request.getParameter("pagelink");
		boolean flag=true;

		if(pagelink==null) {
			System.out.println("pagelink null!!!!!!!!!!!!!!!1");
			flag=false;
		}else {
			for(int i=0;i<pagelink.length();i++) {	//빈문자입력시 예외처리를 위한 flag체크
				if(pagelink.charAt(i)==' ') {
					flag=false;
					break;
				}
			}
		}

		if (flag && pagelink != null && (pagelink.trim()).length() == pagelink.length()) {

			try {
				RestaurantDAO.updateRestaurant(request.getParameter("rid"), pagelink);
				request.getSession().setAttribute("restaurant",
						RestaurantDAO.getSingleRestaurant(request.getParameter("rid")));
				request.getSession().setAttribute("successMsg", "수정 완료");
				url = "restaurantDetail.jsp";

			} catch (Exception s) {
				request.getSession().setAttribute("errorMsg", s.getMessage());
				s.printStackTrace();
			}
		} else {
			request.getSession().setAttribute("errorMsg", "상세정보페이지 링크 입력값을 다시 한번 확인해주세요.");
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
}
