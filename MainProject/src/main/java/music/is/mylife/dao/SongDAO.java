package music.is.mylife.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SongDAO {
	
	@Autowired
	private SqlSession session;
	

	public void func3() {
		System.out.println("권윤영");
		System.out.println("is");
		System.out.println("바보");
	}
	public void func4() {
		System.out.println("전진");
		System.out.println("is");
		System.out.println("아이디어뱅크");
	}
	public void func5() {
		System.out.println("박화원");
		System.out.println("is");
		System.out.println("권윤영 담당 일진");

	}
}
