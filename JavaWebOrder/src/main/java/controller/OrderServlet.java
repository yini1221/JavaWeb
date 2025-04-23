package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.OrderDTO;
import service.OrderService;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	
	private OrderService orderService = new OrderService();
	
	// 查看歷史資料
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 得到歷史紀錄
		List<OrderDTO> orderDTOs = orderService.getOrderHistory();
		// 重導到指定 jsp 並帶上歷史紀錄資料
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/history.jsp");
		req.setAttribute("orderDTOs", orderDTOs);
		rd.forward(req, resp);
	}
	
	// 接收訂單的請求
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
