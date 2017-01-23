package member;

import util.db.ConnectionPoolBean;

public class MemberDAO {
	
	public void join(){
		ConnectionPoolBean bean;
		try {
			bean = new ConnectionPoolBean();
			bean.getConnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
