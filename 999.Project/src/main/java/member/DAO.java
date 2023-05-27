package member;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;








public class DAO {
	
	private static SqlSession sql;
	static {
		String resource = "mybatis/conn.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		sql = sqlSessionFactory.openSession();//Connection객체를 이용해서 통신 여는 처리 같음.
	}

	
	public void test() {
		// 1.마이바티스 매퍼를 이용하여 dual테이블로 숫자 1가져오기.
		int result = sql.selectOne("mem.dual");
		System.out.println(result);
	}
	
	public List<DTO> listSelect() {
		// ( customer-mapper ) 추가 후 작업
		// 2.마이바티스 매퍼를 이용하여 customer테이블의 전체 내용을 가져오기.
		List<DTO> list = sql.selectList("mem.list");
		System.out.println(list.size());
		return list;
	}
	public void insert(DTO dto) {
		sql.insert("mem.insert",dto);
		sql.commit();
		
	}
	public String loginid(String id) {
		String userid = sql.selectOne("mem.loginid",id);
		return userid;
	}
	
	public String loginpw(String id) {
		String userpw = sql.selectOne("mem.loginpw",id);
		return userpw;
	}
	
}
