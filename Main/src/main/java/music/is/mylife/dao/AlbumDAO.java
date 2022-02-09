package music.is.mylife.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlbumDAO {
	
	@Autowired
	private SqlSession session;
	
	public void func1() {
		System.out.println("함수 1");
	}
	public void func2() {
		System.out.println("함수 2");
	}
	public void func3() {
		System.out.println("함수 3");
	}
}
