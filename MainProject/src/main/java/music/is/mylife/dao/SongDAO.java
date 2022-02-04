package music.is.mylife.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SongDAO {
	
	@Autowired
	private SqlSession session;
	
	public void func1() {
		System.out.println("master함수");
		System.out.println("master함수");
		System.out.println("master함수");
	}
	public void func2() {
		System.out.println("master함수");
		System.out.println("master함수");
		System.out.println("master함수");
	}
	public void func3() {
		System.out.println("master함수");
		System.out.println("master함수");
		System.out.println("master함수");
	}
}
