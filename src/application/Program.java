package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller obj2 = new Seller(1, "William", "williamdevide@gmail.com", new Date(), 3000.00, obj);
		System.out.println(obj2);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println(department);
	}

}
